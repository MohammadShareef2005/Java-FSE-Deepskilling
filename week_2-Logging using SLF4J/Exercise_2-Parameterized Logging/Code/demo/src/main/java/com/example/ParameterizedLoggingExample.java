package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "shareef";
        int loginAttempts = 3;
        boolean isLocked = true;

        logger.info("User {} attempted to login {} times.", username, loginAttempts);
        logger.warn("Account locked status for user {}: {}", username, isLocked);
        logger.error("Too many failed attempts for user: {}", username);
    }
}
