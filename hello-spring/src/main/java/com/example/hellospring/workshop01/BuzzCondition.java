package com.example.hellospring.workshop01;

class BuzzCondition implements Condition {
    @Override
    public boolean isMatchCondition(Integer input) {
        return input % 5 == 0;
    }

    @Override
    public String result() {
        return "Buzz";
    }

}
