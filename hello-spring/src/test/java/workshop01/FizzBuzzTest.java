package workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void fizzBuzz1(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(1);
        String expectedValue = "1";
        assertEquals(result, expectedValue);
    }

}