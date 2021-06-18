package com.example.hellospring.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("1 -> 1")
    void checkFizzBuzzCase01() {
        int input = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("1", actualResult);
    }

    @Test
    @DisplayName("2 -> 2")
    void checkFizzBuzzCase02() {
        int input = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("2", actualResult);
    }

    @Test
    @DisplayName("3 -> Fizz")
    void checkFizzBuzzCase03() {
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("4 -> 4")
    void checkFizzBuzzCase04() {
        int input = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("4", actualResult);
    }

    @Test
    @DisplayName("5 -> Buzz")
    void checkFizzBuzzCase05() {
        int input = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Buzz", actualResult);
    }

    @Test
    @DisplayName("6 -> Fizz")
    void checkFizzBuzzCase06() {
        int input = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("7 -> KBTG Java Basic")
    void checkFizzBuzzCase07() {
        int input = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("KBTG Java Basic", actualResult);
    }

    @Test
    @DisplayName("8 -> 8")
    void checkFizzBuzzCase08() {
        int input = 8;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("8", actualResult);
    }

    @Test
    @DisplayName("9 -> Fizz")
    void checkFizzBuzzCase09() {
        int input = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("10 -> Buzz")
    void checkFizzBuzzCase10() {
        int input = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Buzz", actualResult);
    }

    @Test
    @DisplayName("11 -> 11")
    void checkFizzBuzzCase11() {
        int input = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("11", actualResult);
    }

    @Test
    @DisplayName("12 -> Fizz")
    void checkFizzBuzzCase12() {
        int input = 12;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("Fizz", actualResult);
    }

    @Test
    @DisplayName("15 -> FizzBuzz")
    void checkFizzBuzzCase15() {
        int input = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("FizzBuzz", actualResult);
    }

    @Test
    @DisplayName("30 -> FizzBuzz")
    void checkFizzBuzzCase30() {
        int input = 30;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.setInput(input);
        String actualResult = fizzBuzz.getResult();
        assertEquals("FizzBuzz", actualResult);
    }
}