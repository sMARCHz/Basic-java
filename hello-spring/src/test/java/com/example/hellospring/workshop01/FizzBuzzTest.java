package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void checkFizz() {
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        boolean isFizz = fizzBuzz.isFizz();
        assertTrue(isFizz);
    }

    @Test
    void checkFizzAsResult() {
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Fizz", actualResult);
    }
}