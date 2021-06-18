package com.example.hellospring.workshop01;

import java.util.List;

public class FizzBuzz {
    private int input;

    public void setInput(int input) {
        this.input = input;
    }

    public String getResult() {
        Condition[] myConditions = new Condition[]{
                new KBTGCondition(),
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition()
        };
        for (Condition myCondition : myConditions) {
            if(myCondition.isMatchCondition(input)) {
                return myCondition.result();
            }
        }
        return String.valueOf(input);
    }
}
