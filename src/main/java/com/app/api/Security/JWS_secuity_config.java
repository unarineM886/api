package com.app.api.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.app.api.Security.OAuth2JwtSuccessHandler;

@Configuration
@EnableWebSecurity
public class JWS_secuity_config{
	
	private final OAuth2JwtSuccessHandler oAuth2JwtSuccessHandler;
	
	// Add a constructor that accepts both dependencies
    public JWS_secuity_config(RateLimitFilter rateLimitFilter,
                              OAuth2JwtSuccessHandler oAuth2JwtSuccessHandler) {
        this.oAuth2JwtSuccessHandler = oAuth2JwtSuccessHandler;
    }
	
	@Bean
	public SecurityFilterChain filterChain(
	        HttpSecurity http,
	        RateLimitFilter rateLimitFilter
			) throws Exception {
		
		
        	http
            // 1. Disable CSRF (required for stateless REST APIs)
            .csrf(csrf -> csrf.disable())

            // 2. Authorize requests
            .authorizeHttpRequests(auth -> auth
            		
                // public endpoints 
                .requestMatchers("/v1/users/loginjws", 
                				 "/v1/web/add",
               				 "/v1/users/signupjws",
                				 "/oauth2/**",     // ⬅ NEW — lets Google login start
                				 "/login/**"       // ⬅ NEW — lets Google's callback land
                				 
                				 
                ).permitAll()
                
                // everything else must be authenticated
                .anyRequest().authenticated()
            )

            // 3. Make session stateless making every reqest independent (IMPORTANT for JWT)
            .sessionManagement(session -> session
                .sessionCreationPolicy(
                    org.springframework.security.config.http.SessionCreationPolicy.STATELESS
                )
            );
        
            // ---- NEW: attach the success handler ----
            
            /*.oauth2Login(oauth2 -> oauth2
                .successHandler(oAuth2JwtSuccessHandler)
            );*/
        
        
        // 4. Add JWT filter BEFORE Spring Security authentication filter
        http.addFilterBefore(
                new JwtFilter(),
                UsernamePasswordAuthenticationFilter.class
        );
        
        // make sure the rate limit filter is applied before jwt filter
        http.addFilterBefore(
                rateLimitFilter,
                UsernamePasswordAuthenticationFilter.class
        );

        http.addFilterAfter(
                new JwtFilter(),
                RateLimitFilter.class
        );

        return http.build();
    }
}  