package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App calc = new App();

    @Test
    public void testAddition() {
        assertEquals(8, calc.add(5,3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calc.subtract(5,3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calc.multiply(5,3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(6,3));
    }
}
