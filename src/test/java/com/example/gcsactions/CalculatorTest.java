package com.example.gcsactions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldSum() {
        Calculator c = new Calculator();
        assertEquals(4, c.add(2, 2));
    }

    @Test
    void subtract_shouldSub() {
        Calculator c = new Calculator();
        assertEquals(0, c.subtract(2, 2));
    }

    @Test
    void multiply_shouldMultiply() {
        Calculator c = new Calculator();
        assertEquals(9, c.multiply(3, 3));
    }

    @Test
    void divide_shouldDivide() {
        Calculator c = new Calculator();
        assertEquals(2.5, c.divide(5, 2), 0.0001);
    }

    @Test
    void divide_byZero_shouldThrow() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(5, 0));
    }
}
