package com.apeiro.sample;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testCalculateTax() {
        assertEquals(160.0, calculator.calculateTax(1000.0), 0.01);
    }

    @Test
    public void testParseNumber() {
        assertEquals(42, calculator.parseNumber("42"));
        assertEquals(0, calculator.parseNumber("invalid"));
    }
}
