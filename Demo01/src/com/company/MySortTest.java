package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    //    Test cases
//    [] => []
//    [1] => [1]
//    [1,2] => [1,2]
//    [2,1] => [1,2]
//    [1,2,3] => [1,2,3]
//    [2,1,3] => [1,2,3]
//    [1,3,2] => [1,2,3]
//    [3,2,1] => [1,2,3]
//    [5,4,3,2,1]  [1,2,3,4,5]
    @Test
    void sortWithBlankList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expect = new ArrayList<>();

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    void sortWithOneNumber() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }
}