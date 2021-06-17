package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    @DisplayName("Sorting with empty list")
    public void emptyValue(){
        List<Integer> expectedValue = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Sorting with 1 value list")
    public void oneValue(){
        List<Integer> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        List<Integer> input = new ArrayList<>();
        input.add(1);
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Sorting with 2 sorted value list")
    public void twoSortedValue(){
        List<Integer> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Sorting with 2 unsorted value list")
    public void twoUnsortedValue(){
        List<Integer> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Sorting with 3 sorted value list")
    public void threeSortedValue(){
        List<Integer> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add(3);
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Sorting with 3 unsorted value list")
    public void threeUnsortedValue(){
        List<Integer> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add(3);
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(3);
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Sorting with 3 unsorted value list")
    public void threeUnsortedValue2(){
        List<Integer> expectedValue = new ArrayList<>();
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add(3);
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(2);
        input.add(1);
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }
}