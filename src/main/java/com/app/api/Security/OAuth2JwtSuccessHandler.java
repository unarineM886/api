package com.app.api.Security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import com.app.api.respitory.customer_login_respority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.app.api.Entity.Customer_login;
import com.app.api.respitory.customer_login_respority;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


@Component
public class OAuth2JwtSuccessHandler implements AuthenticationSuccessHandler {

    private final JWS_utility jwtUtil;
    private final customer_login_respority customerRepo;

    public OAuth2JwtSuccessHandler(JWS_utility jwtUtil,
            customer_login_respority customerRepo) {
    	this.jwtUtil = jwtUtil;
    	this.customerRepo = customerRepo;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException {

        OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) authentication;
        String provider = oauthToken.getAuthorizedClientRegistrationId(); // "google" or "facebook"
        
        System.out.println("provider: " + provider);

        
        String email = null;

        if (provider.equals("google")) {
            // Google uses OIDC
            OidcUser oidcUser = (OidcUser) oauthToken.getPrincipal();
            email = oidcUser.getEmail();

        } else if (provider.equals("facebook")) {
            // Facebook uses plain OAuth2User (NOT OidcUser)
            OAuth2User oauth2User = (OAuth2User) oauthToken.getPrincipal();
            System.out.println("oauth2User" + oauth2User);
            email = oauth2User.getAttribute("email");
            System.out.println("email" + email);
        }

        response.setContentType("application/json");

        // Guard: email could be null if Facebook user denied email permission
        if (email == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            Map<String, Object> error = new HashMap<>();
            error.put("success", false);
            error.put("message", "Could not retrieve email from " + provider);
            response.getWriter().write(new ObjectMapper().writeValueAsString(error));
            return;
        }

        // Look up customer by email
        Optional<Customer_login> customerOpt = customerRepo.findByEmail(email);

        if (customerOpt.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            Map<String, Object> error = new HashMap<>();
            error.put("success", false);
            error.put("message", "Email not registered: " + email);
            response.getWriter().write(new ObjectMapper().writeValueAsString(error));
            return;
        }
        
        System.out.println("cust email found");

        // Customer found — generate JWT
        Customer_login customer = customerOpt.get();
        String custRef = customer.getNumber();
        String token = jwtUtil.generateToken(custRef, "customer");

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("type", "customer");
        result.put("token", token);
        result.put("user", customer);

        response.getWriter().write(new ObjectMapper().writeValueAsString(result));
    }
}