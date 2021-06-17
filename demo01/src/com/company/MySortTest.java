package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    @DisplayName("Sorting with empty list")
    public void emptySort(){
        List<Integer> expectedValue = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        MySort test = new MySort((ArrayList<Integer>) input);
        List<Integer> result = test.ascendingSort();
        assertEquals(expectedValue, result);
    }
}