package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = args[0]; // (1,5]
        MyRange myRange = new MyRange(input);
        System.out.println(myRange.getResult());
    }
}
