package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    void checkStartWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean isExclude = myRange.checkStartWithExclude();
        assertTrue(isExclude);
    }

    @Test
    void checkStartWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean isExclude = myRange.checkStartWithExclude();
        assertFalse(isExclude);
    }

    @Test
    void checkEndWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        boolean isExclude = myRange.checkEndWithExclude();
        assertTrue(isExclude);
    }

    @Test
    void checkEndWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean isExclude = myRange.checkStartWithExclude();
        assertFalse(isExclude);
    }

    @Test
    void getStartNumber() {
        MyRange myRange = new MyRange("[1,5]");
        int firstNumber = myRange.getStartNumber();
        assertEquals(1, firstNumber);
    }

    @Test
    void getEndNumber() {
        MyRange myRange = new MyRange("[1,5]");
        int endNumber = myRange.getEndNumber();
        assertEquals(5, endNumber);
    }

    @Test
    void getResult() {
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.getResult();
        assertEquals("12345", result);
    }
}