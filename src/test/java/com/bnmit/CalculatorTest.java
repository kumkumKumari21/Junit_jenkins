package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class CalculatorTest{
    Calculator calculator=new Calculator();
    @Test
    void testAddition(){
        assertEquals(10,calculator.add(5,5));
    }
    @Test
    void testDisvision(){
        assertEquals(2,calculator.divide(10,5));
    }
    @Test
    void testDivideByZero(){
        Exception exception=assertThrows(IllegalArgumentException.class,()->calculator.divide(10,0));
        assertEquals("Cannot be divided by Zero",exception.getMessage());
    }
}
