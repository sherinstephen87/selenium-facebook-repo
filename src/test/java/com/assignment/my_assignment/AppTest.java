package com.assignment.my_assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testsummethod() {
    	Calculator calc = new Calculator();
    	assertEquals(40, calc.sum(30, 10));
    }
    
    @Test
    public void testdiffmethod() {
    	Calculator calc = new Calculator();
    	assertEquals(10, calc.diff(20, 10));
    }
}

