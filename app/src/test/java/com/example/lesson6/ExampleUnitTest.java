package com.example.lesson6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class
ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(6, 3 + 3);
    }

    @Test
    public void subtraction_isCorrect(){
        assertEquals(6, 8 - 2);
    }

    @Test
    public void multiply_isCorrect(){
        assertEquals(6, 2 * 3);
    }

    @Test
    public void division_isCorrect(){
        assertEquals(6, 18 / 3);
    }
}