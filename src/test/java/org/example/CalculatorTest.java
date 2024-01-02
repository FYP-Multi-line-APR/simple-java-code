package org.example;

import org.junit.jupiter.api.Test;
import org.example.Calculator;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0));
        assertEquals(-1.5, Calculator.add(-1.0, -0.5));
    }

    @Test
    void testSubtract() {
        assertEquals(2.0, Calculator.subtract(5.0, 3.0));
        assertEquals(-2.0, Calculator.subtract(-1.0, 1.0));
    }

    @Test
    void testMultiply() {
        assertEquals(15.0, Calculator.multiply(3.0, 5.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0));
        assertEquals(-4.0, Calculator.divide(8.0, -2.0));
    }

    @Test
    void testDivideByZero() {
        // Ensure that an ArithmeticException is thrown when dividing by zero
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5.0, 0.0));
    }

    @Test
    void testSquareRoot() {
        assertEquals(2.0, Calculator.squareRoot(4.0));
        assertEquals(0.0, Calculator.squareRoot(0.0));
        assertThrows(ArithmeticException.class, () -> Calculator.squareRoot(-1.0));
    }

    @Test
    void testPercentage() {
        assertEquals(0.5, Calculator.percentage(0.5));
    }

    @Test
    void testModulus() {
        assertEquals(1.0, Calculator.modulus(5.0, 2.0));
        assertEquals(0.0, Calculator.modulus(10.0, 5.0));
        assertThrows(ArithmeticException.class, () -> Calculator.modulus(8.0, 0.0));
    }

    @Test
    void testPower() {
        assertEquals(8.0, Calculator.power(2.0, 3.0));
        assertEquals(1.0, Calculator.power(10.0, 0.0));
        assertEquals(27.0, Calculator.power(3.0, 3.0));
    }

    @Test
    void testSin() {
        assertEquals(0.0, Calculator.sin(0.0));
        assertEquals(1.0, Calculator.sin(90.0));
        assertEquals(-1.0, Calculator.sin(270.0));
    }

    @Test
    void testCos() {
        assertEquals(1.0, Calculator.cos(0.0));
        assertEquals(0.0, Math.round(Calculator.cos(90.0)));
        assertEquals(-1.0, Calculator.cos(180.0));
    }

    @Test
    void testTan() {
        assertEquals(0.0, Calculator.tan(0.0));
        assertEquals(Double.POSITIVE_INFINITY, Calculator.tan(90.0));
    }

    @Test
    void testLog() {
        assertEquals(1.0, Calculator.log(10.0));
        assertEquals(0.0, Calculator.log(1.0));
        assertThrows(ArithmeticException.class, () -> Calculator.log(0.0));
    }

    @Test
    void testExp() {
        assertEquals(Math.exp(2.0), Calculator.exp(2.0));
        assertEquals(Math.exp(0.0), Calculator.exp(0.0));
    }

    @Test
    void testModulus2() {
        assertEquals(1.0, Calculator.modulus(5.0, 2.0));
        assertEquals(0.0, Calculator.modulus(10.0, 5.0));
        assertThrows(ArithmeticException.class, () -> Calculator.modulus(8.0, 0.0));
    }
}
