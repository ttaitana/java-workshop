package workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void fizzBuzz1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(1);
        String expectedValue = "1";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz2() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(2);
        String expectedValue = "2";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz3() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(3);
        String expectedValue = "Fizz";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz4() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(4);
        String expectedValue = "4";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz5() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(5);
        String expectedValue = "Buzz";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz6() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(6);
        String expectedValue = "Fizz";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz7() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(7);
        String expectedValue = "7";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz8() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(8);
        String expectedValue = "8";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz9() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(9);
        String expectedValue = "Fizz";
        assertEquals(expectedValue, result);
    }

    @Test
    public void fizzBuzz10() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.printFizzBuzz(10);
        String expectedValue = "Buzz";
        assertEquals(expectedValue, result);
    }

}