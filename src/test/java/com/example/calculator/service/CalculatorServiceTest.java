
package com.example.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(5, service.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, service.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, service.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, service.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(5, 0));
    }
}
