package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRange2Test {
    @Test
    @DisplayName("Get left bracket/parentheses value with input as [")
    public void getLeftController(){
        int expectResult = 0;
        MyRange2 test = new MyRange2("[1,5]");
        int result = test.getLeftController();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get left bracket/parentheses value with input as (")
    public void getLeftController2(){
        int expectResult = 1;
        MyRange2 test = new MyRange2("(1,5]");
        int result = test.getLeftController();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get right bracket/parentheses value with input as ]")
    public void getRightController(){
        int expectResult = 1;
        MyRange2 test = new MyRange2("[1,5]");
        int result = test.getRightController();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get right bracket/parentheses value with input as )")
    public void getRightController2(){
        int expectResult = 0;
        MyRange2 test = new MyRange2("[1,5)");
        int result = test.getRightController();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get start number")
    public void getStartNumber(){
        int expectResult = 1;
        MyRange2 test = new MyRange2("[1,5)");
        int result = test.getStartNumber();
        assertEquals(expectResult, result);
    }
    @Test
    @DisplayName("Get end number")
    public void getEndNumber(){
        int expectResult = 5;
        MyRange2 test = new MyRange2("[1,5)");
        int result = test.getEndNumber();
        assertEquals(expectResult, result);
    }


    @Test
    @DisplayName("Get range of numbers with input [1,5]")
    public void getRange(){
        String expectResult = "1,2,3,4,5";
        MyRange2 test = new MyRange2("[1,5]");
        String result = test.getRange();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get range of numbers with input (1,5]")
    public void getRange2(){
        String expectResult = "2,3,4,5";
        MyRange2 test = new MyRange2("(1,5]");
        String result = test.getRange();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get range of numbers with input [1,5)")
    public void getRange3(){
        String expectResult = "1,2,3,4";
        MyRange2 test = new MyRange2("[1,5)");
        String result = test.getRange();
        assertEquals(expectResult, result);
    }

    @Test
    @DisplayName("Get range of numbers with input (1,5)")
    public void getRange4(){
        String expectResult = "2,3,4";
        MyRange2 test = new MyRange2("(1,5)");
        String result = test.getRange();
        assertEquals(expectResult, result);
    }
}