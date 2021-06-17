package com.company;

public class MyRange {
    private String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithExclude() {
        return this.input.startsWith("(");
    }

    public boolean checkEndWithExclude() {
        return this.input.endsWith(")");
    }

    public int getStartNumber() {
        int startNumber = Character.getNumericValue(input.charAt(1));
        if(checkStartWithExclude()) {
            startNumber += 1;
        }
        return startNumber;
    }

    public int getEndNumber() {
        int endNumber = Character.getNumericValue(input.charAt(3));
        if(checkEndWithExclude()) {
            endNumber -= 1;
        }
        return endNumber;
    }

    public String getResult() {
        int startNumber = getStartNumber();
        int endNumber = getEndNumber();
        String result = "";
        for (int i = startNumber; i < endNumber+1; i++) {
            result += String.valueOf(i);
        }
        return result;
    }
}
