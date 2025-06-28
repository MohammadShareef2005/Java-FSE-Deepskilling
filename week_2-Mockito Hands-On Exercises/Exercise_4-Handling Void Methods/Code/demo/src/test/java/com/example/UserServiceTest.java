package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserServiceTest {

    @Test
    public void testVoidMethodCalled() {

        Logger mockLogger = mock(Logger.class);

        UserService service = new UserService(mockLogger);

        service.createUser("Alice");

        verify(mockLogger).log("User created: Alice");
    }
}
