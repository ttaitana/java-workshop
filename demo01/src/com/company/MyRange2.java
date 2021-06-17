package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyRange2 {
    private String input;

    MyRange2(String input){
        this.input = input;
    }

    public int getLeftController() {
        char controller = this.input.charAt(0);
        return controller == '[' ? 0 : 1;
    }

    public int getRightController() {
        char controller = this.input.charAt(this.input.length() - 1);
        return controller == ']' ? 1 : 0;
    }

    public int getStartNumber() {
        String[] numberRange = input.replaceAll("[\\[ \\]()]", "").split("[,]");
        return Integer.parseInt(numberRange[0]);
    }

    public int getEndNumber() {
        String[] numberRange = input.replaceAll("[\\[ \\]()]", "").split("[,]");
        return Integer.parseInt(numberRange[1]);
    }

    public String getRange() {
        int leftController = this.getLeftController();
        int rightController = this.getRightController();
        int start = getStartNumber() + leftController;
        int end = getEndNumber() + rightController;

        String result = Arrays.toString(IntStream.range(start, end).toArray());
        result = result.replaceAll("[\\[\\] ]", "");
        return result;
    }
}
