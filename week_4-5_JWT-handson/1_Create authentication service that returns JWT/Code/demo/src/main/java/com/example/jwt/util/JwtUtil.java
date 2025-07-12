package com.example.jwt.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRET_KEY = "my-very-secret-key-my-very-secret-key"; // Minimum 256-bit key for HS256

    public String generateToken(String username) {
        long nowMillis = System.currentTimeMillis();
        long expirationMillis = nowMillis + 1000 * 60 * 60; // 1 hour

        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8)); // 🔥 fix here

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(nowMillis))
                .setExpiration(new Date(expirationMillis))
                .signWith(key, SignatureAlgorithm.HS256) // updated API
                .compact();
    }
}
