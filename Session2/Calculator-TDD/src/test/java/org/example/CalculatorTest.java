package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }


    //addition
    @Test
    void shouldReturnCorrectSumWhenAddingTwoIntegerNumbers() {
        int actual = calculator.sum(2,1);
        assertEquals(3, actual);
    }

    @Test
    void shouldReturnCorrectSumWhenAddingTwoLongNumbers() {
        long actual = calculator.sum(2_000_000_000L,100_000_000L);
        assertEquals(2_100_000_000, actual);
    }


    @Test
    void shouldReturnCorrectSumWhenAddingTwoShortNumbers() {
        short a = -15_000;
        short b = 16_000;
        short actual = calculator.sum(a,b);
        assertEquals(1_000, actual);
    }


    @Test
    void shouldReturnCorrectSumWhenAddingTwoFloatNumbers() {
        float actual = calculator.sum(5.35F,1.35F);
        assertEquals(6.70F, actual,0.001);
    }

    @Test
    void shouldReturnCorrectSumWhenAddingTwoDoubleNumbers() {
        double actual = calculator.sum(2.80D,1.10D);
        assertEquals(3.9D, actual, 0.01);
    }

    //subtraction
    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingTwoIntegerNumbers() {
        int actual = calculator.difference(2,1);
        assertEquals(1, actual);
    }

    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingTwoLongNumbers() {
        long actual = calculator.difference(2_000_000_000L,1_000_000_000L);
        assertEquals(1_000_000_000, actual);
    }

    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingTwoShortNumbers() {
        short a = 20_000;
        short b = 15_000;
        short actual = calculator.difference(a,b);
        assertEquals(5_000, actual);
    }

    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingTwoFloatNumbers() {
        float actual = calculator.difference(5.70F,1.35F);
        assertEquals(4.35F, actual,0.001);
    }

    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingTwoDoubleNumbers() {
        double actual = calculator.difference(2.80D,1.10D);
        assertEquals(1.7D, actual, 0.01);
    }


    //multiplication
    @Test
    void shouldReturnCorrectProductWhenMultiplyingTwoIntegerNumbers(){
        int actual = calculator.prod(10,30);
        assertEquals(300, actual);
    }

    @Test
    void shouldReturnCorrectProductWhenMultiplyingTwoLongNumbers(){
        long actual = calculator.prod(10_000_000L,30L);
        assertEquals(300_000_000L, actual);
    }

    @Test
    void shouldReturnCorrectProductWhenMultiplyingTwoShortNumbers(){
        short a = 2;
        short b = 5_000;
        short actual = calculator.prod(a,b);
        assertEquals(10_000, actual);
    }


    @Test
    void shouldReturnCorrectProductWhenMultiplyingTwoFloatNumbers(){
        float actual = calculator.prod(5F, 3F);
        assertEquals(15F, actual);
    }

    @Test
    void shouldReturnCorrectProductWhenMultiplyingTwoDoubleNumbers(){
        double actual = calculator.prod(5D, 3D);
        assertEquals(15D, actual);
    }

    //Division
    @Test
    void shouldReturnCorrectQuotientWhenDividingTwoIntegerNumbers(){
        int actual = calculator.div(15, 3);
        assertEquals(5, actual);
    }
    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        // Use assertThrows to verify that an exception is thrown
        IllegalArgumentException thrownException = assertThrows(IllegalArgumentException.class, () -> {
            calculator.div(15, 0);
        });
        assertEquals("Divisor cannot be zero.", thrownException.getMessage());
    }

    @Test
    void shouldReturnCorrectQuotientWhenDividingTwoFloatNumbers(){
        float actual = calculator.div(15.0f, 3.0f);
        assertEquals(5.0f, actual);
    }


    @Test
    void shouldReturnCorrectQuotientWhenDividingTwoShortNumbers(){
        short actual = calculator.div((short)15_000, (short)3_000);
        assertEquals(5, actual);
    }
    @Test
    void shouldReturnCorrectQuotientWhenDividingTwoLongNumbers(){
        long actual = calculator.div(15L, 3L);
        assertEquals(5L, actual);
    }
    @Test
    void shouldReturnCorrectQuotientWhenDividingTwoDoubleNumbers(){
        double actual = calculator.div(15D, 3D);
        assertEquals(5D, actual);
    }

}