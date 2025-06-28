package com.example;

public class UserService {

    private Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void createUser(String name) {
        // do something here...
        logger.log("User created: " + name); // void method called
    }
}
