package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NotificationServiceTest {

    @Test
    public void testArgumentMatching() {

        Notifier mockNotifier = mock(Notifier.class);

        NotificationService service = new NotificationService(mockNotifier);
        service.notifyUser();

        verify(mockNotifier).send("Welcome!");
        verify(mockNotifier).send(eq("Welcome"));

    }
}
