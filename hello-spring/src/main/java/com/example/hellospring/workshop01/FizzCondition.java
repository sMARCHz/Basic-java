package com.example.hellospring.workshop01;

class FizzCondition implements Condition {
    @Override
    public boolean isMatchCondition(Integer input) {
        return input % 3 == 0;
    }

    @Override
    public String result() {
        return "Fizz";
    }
}
