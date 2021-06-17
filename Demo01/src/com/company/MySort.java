package com.company;

import java.util.List;

public class MySort {
    private List<Integer> input;

    public MySort(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> sort() {
        if (input.size() < 2) {
            return input;
        }
        for (int i = 0; i < input.size(); i++) {
            for (int j = i+1; j < input.size(); j++) {
                if(input.get(j) < input.get(i)) {
                    int temp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, temp);
                }
            }
        }
        return input;
    }
}
