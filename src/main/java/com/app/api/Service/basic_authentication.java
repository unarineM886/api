/*package com.app.api.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


// This class sets up Basic Authentication for the API using Spring Security.
@Configuration
@EnableWebSecurity
public class basic_authentication {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // Disable CSRF — not needed for stateless REST APIs
            .csrf(csrf -> csrf.disable())

            // Make the API not save credentials — every request must authenticate again 
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            )

            // Define which endpoints need authentication
            .authorizeHttpRequests(auth -> auth
                // Public endpoints (no login needed) — add yours here
                .requestMatchers("/api/public/**").permitAll()
                
                
                // Everything else requires authentication
                .anyRequest().authenticated()
            )

            // Enable Basic Auth (username + password in header)
            .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        // USER 1 — regular customer
        UserDetails user1 = User.builder()
            .username("customer")
            .password(passwordEncoder().encode("Customer123"))
            .roles("USER")
            .build();

        // USER 2 — employee
        UserDetails employee = User.builder()
            .username("employee")
            .password(passwordEncoder().encode("Employee123"))
            .roles("EMPLOYEE")
            .build();

        // ADMIN — full access
        UserDetails admin = User.builder()
            .username("admin")
            .password(passwordEncoder().encode("Admin123"))
            .roles("ADMIN","USER","EMPLOYEE")
            .build();

        return new InMemoryUserDetailsManager(user1, employee, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}*/