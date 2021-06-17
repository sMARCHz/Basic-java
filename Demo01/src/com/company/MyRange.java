package com.company;

import java.util.ArrayList;

public class MyRange {

    public static void main(String[] args) {
        String str = args[0]; // (1,5]
        int startNumber = Character.getNumericValue(str.charAt(1));
        int endNumber = Character.getNumericValue(str.charAt(3));
        if (str.charAt(0) == '(') {
            startNumber += 1;
        }
        if (str.charAt(str.length()-1) == ')') {
            endNumber -= 1;
        }
        for (int i = startNumber; i < endNumber+1; i++) {
            if (i==endNumber) {
                System.out.print(i);
            }
            else {
                System.out.print(i + ",");
            }
        }
    }
}
