package com.example.jwt.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.model.JwtResponse;
import com.example.jwt.util.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<JwtResponse> authenticate(HttpServletRequest request) {
        System.out.println(">>> /authenticate called");

        String authHeader = request.getHeader("Authorization");
        System.out.println("Authorization Header: " + authHeader);

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).build();
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        String[] values = credentials.split(":", 2);

        System.out.println("Parsed user: " + values[0] + ", pass: " + values[1]);

        if ("user".equals(values[0]) && "pwd".equals(values[1])) {
            String token = jwtUtil.generateToken(values[0]);
            return ResponseEntity.ok(new JwtResponse(token));
        } else {
            return ResponseEntity.status(401).build();
        }
    }

}
