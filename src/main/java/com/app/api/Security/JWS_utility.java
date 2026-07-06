package com.app.api.Security;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;


//Generate and validate JSON Web Tokens (JWTs) for authentication and authorization purposes in a Java application. 
@Service
public class JWS_utility {

    private static final String SECRET = "my-venlink-super-secret-key-777-very-secure"; //secret key

    
    private static final long EXPIRATION = 1000 * 60 * 60 * 2; // 2 hours for token expiration

    private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes()); //creates cryptographic key
    
    public String generateToken(String identifier, String type) {
    	
    	System.out.println("SECRET" + SECRET.getBytes());

        return Jwts.builder()
                .setSubject(identifier) //used to identify customer
                .claim("type", type)    //adds custom data and used to differentiate between customer and employee 
                .setIssuedAt(new Date()) //date of when token was created 
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION)) //set duration how token 
                .signWith(key, SignatureAlgorithm.HS256)  //signs token to prevent tampering with it 
                .compact();              //converts everything into a string 
    }
    
    //validates if token is valid and not expired, returns true if valid, false otherwise
    public boolean validate(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(key) //check if token is legit
                    .build()
                    .parseClaimsJws(token); //makes token readable and checks if the token hasnt expired 
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
    // Extracts claims from the token, such as the subject and custom claims like "type"
    public Claims extractClaims(String token) {
        return Jwts.parserBuilder()   
                .setSigningKey(key)  
                .build()
                .parseClaimsJws(token) 
                .getBody();  //get the body of the token
    }
}