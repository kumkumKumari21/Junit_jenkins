package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    /**
     * Rigorous Test :-)
     */
    Calculator calculator=new Calculator();
    @Test
    void testaddition(){
        assertEquals(10,calculator.add(5,5));
    }
}
