package com.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up...");
        mathUtils = new MathUtils();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up...");
        mathUtils = null;
    }

    @Test
    public void testMultiply() {

        int result = mathUtils.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test
    public void testIsEvenTrue() {

        boolean result = mathUtils.isEven(8);

        assertTrue(result);
    }

    @Test
    public void testIsEvenFalse() {

        boolean result = mathUtils.isEven(7);

        assertFalse(result);
    }
}
