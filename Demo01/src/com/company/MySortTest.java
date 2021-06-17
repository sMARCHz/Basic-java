package com.company;

import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Sort with Empty list")
    void sortWithBlankList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expect = new ArrayList<>();

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    @DisplayName("Sort with one number in the list")
    void sortWithOneNumber() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    @DisplayName("Sort with [1,2]")
    void sortWithTwoNumberCase01() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,2));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    @DisplayName("Sort with [2,1]")
    void sortWithTwoNumberCase02() {
        List<Integer> input = new ArrayList<>(Arrays.asList(2,1));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    @DisplayName("Sort with [1,2,3]")
    void sortWithThreeNumberCase01() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2,3));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    @DisplayName("Sort with [2,1,3]")
    void sortWithThreeNumberCase02() {
        List<Integer> input = new ArrayList<>(Arrays.asList(2,1,3));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2,3));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }

    @Test
    @DisplayName("Sort with [1,3,2]")
    void sortWithThreeNumberCase03() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,3,2));
        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2,3));

        MySort mySort = new MySort(input);
        List<Integer> sortedList = mySort.sort();
        assertEquals(expect, sortedList);
    }
}