package workshop01;

public class FizzBuzz {
    public String printFizzBuzz(int number) {
        String result = number % 3 == 0 & number % 5 == 0 ? "FizzBuzz" : number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : Integer.toString(number);
        return result;
    }
}
