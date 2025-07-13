package com.cognizant.springlearn.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private String secret = "secret"; // Secret key for signing JWT

    public String generateToken(String username) {
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10)) // 10 mins
            .signWith(SignatureAlgorithm.HS256, secret)
            .compact();
    }
}
