package com.example.hellospring.workshop01;

public class KBTGCondition implements Condition {

    @Override
    public boolean isMatchCondition(Integer input) {
        return input%7==0;
    }

    @Override
    public String result() {
        return "KBTG Java Basic";
    }
}
