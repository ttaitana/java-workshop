package com.example.hellomavenrest.employee;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberRandom extends Random {
    private int currentNumber;

    @Override
    public int nextInt() {
        int number =  super.nextInt();
        this.setCurrentNumber(number);
        return number;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }
}
