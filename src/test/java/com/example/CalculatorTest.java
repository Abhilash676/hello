package com.example;

import static org.junit.jupiter.api.Assertions.*; // Corrected typo here
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        int res = calc.add(10, 5);
        assertEquals(15, res); // This is correct
    }
}
