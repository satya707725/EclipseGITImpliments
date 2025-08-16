package com.satya.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testWithPositiveNumbers() {
    	App a = new App();
    	int expect = 300;
    	int actual = a.doSum(100, 200);
        assertEquals(expect, actual);
    }
    @Test
    public void testWithNegetiveNumbers() {
    	App a = new App();
    	int expect = -300;
    	int actual = a.doSum(-100, -200);
    	assertEquals(expect, actual);
    }
    @Test
    public void testWithMixedNumbers() {
    	App a = new App();
    	int expect = 100;
    	int actual = a.doSum(-100, 200);
    	assertEquals(expect, actual);
    }
}
