package com.example.hellospring.workshop01;

class FizzBuzzCondition implements Condition {
    FizzCondition fizzCondition = new FizzCondition();
    BuzzCondition buzzCondition = new BuzzCondition();

    @Override
    public boolean isMatchCondition(Integer input) {
        if(fizzCondition.isMatchCondition(input) && buzzCondition.isMatchCondition(input)) {
            return true;
        }
        return false;
    }

    @Override
    public String result() {
        return "FizzBuzz";
    }
}
