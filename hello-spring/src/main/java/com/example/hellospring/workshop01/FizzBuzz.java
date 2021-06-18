package com.example.hellospring.workshop01;

public class FizzBuzz {
    private int input;

    public void setInput(int input) {
        this.input = input;
    }

    public boolean isFizz() {
        return input%3==0 ? true : false;
    }

    public String getResult() {
        if(isFizz()) {
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
