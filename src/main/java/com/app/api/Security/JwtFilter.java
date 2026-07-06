package com.app.api.Security;

//import com.app.api.Service.JWS_utility;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.Collections;

//this filter intercepts incoming HTTP requests, checks for the presence of a JWT in the Authorization header, validates the token, and if valid, sets the authentication in the Spring 

public class JwtFilter extends OncePerRequestFilter {

    private final JWS_utility jwtUtil = new JWS_utility();

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {
    	
    	System.out.println("JwtFilter: initiated");

        String authHeader = request.getHeader("Authorization");
        System.out.println("authHeader: " + authHeader);

        String token = null;
        String username = null;

        // 1. Extract token
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7);
        }
        

        // 2. Validate token
        if (token != null && jwtUtil.validate(token)) {

            Claims claims = jwtUtil.extractClaims(token); //extracts token body
            
            System.out.println("Claims: " + claims);

            username = claims.getSubject(); // who is logged in
            String type = (String) claims.get("type"); // customer / employee

            // 3. Set authentication in Spring Security context
            UsernamePasswordAuthenticationToken authToken =
                    new UsernamePasswordAuthenticationToken(
                            username,
                            null,
                            Collections.emptyList() // you can add roles later
                    );

            authToken.setDetails(
                    new WebAuthenticationDetailsSource().buildDetails(request) //adds request detials such as ip address,session ID etc
            );

            SecurityContextHolder.getContext().setAuthentication(authToken); //tells springboot that the user is officially logged in
        }

        // 4. If token exists but is invalid → reject
        if (token != null && !jwtUtil.validate(token)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid or expired token");
            return;
        }

        // 5. Continue request
        filterChain.doFilter(request, response);
    }
}


