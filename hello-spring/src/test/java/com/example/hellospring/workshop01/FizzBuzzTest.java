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
    void checkBuzz() {
        int input = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        boolean isBuzz = fizzBuzz.isBuzz();
        assertTrue(isBuzz);
    }

    @Test
    void checkFizzAsResult() {
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Fizz", actualResult);
    }

    @Test
    void checkBuzzAsResult() {
        int input = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Buzz", actualResult);
    }
}