package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MyRange {
    private String input;
    private int start;
    private int end;


    MyRange(String input){
        this.input = input;
        this.extractIndicator();
    }

    public void extractIndicator(){
        int arrayLength = input.length();
        int leftIndicator;
        int rightIndicator;
        char leftController = input.charAt(0);
        char rightController = input.charAt(arrayLength - 1);
        String[] numberRange = input.replaceAll("[\\[ \\]()]", "").split("[,]");
        if('[' == (leftController)){
            leftIndicator = 0;
        }else{
            leftIndicator = 1;
        }

        if(']' == (rightController)){
            rightIndicator = 1;
        }else{
            rightIndicator = 0;
        }

        this.start = Integer.parseInt(numberRange[0]) + leftIndicator;
        this.end = Integer.parseInt(numberRange[1]) + rightIndicator;
    }

    public String getResult(){
        String result = Arrays.toString(IntStream.range(this.start, this.end).toArray());
        result = result.replaceAll("[\\[\\] ]", "");
        return result;
    }
}
