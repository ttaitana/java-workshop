package workshop01;

public class FizzBuzz {
    private int number;

    public String printFizzBuzzOld(int number) {
        String result = number % 3 == 0 & number % 5 == 0 ? "FizzBuzz" : number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : Integer.toString(number);
        return result;
    }

    public String printFizzBuzz(int number){
        this.setNumber(number);
        return this.fizzBuzzChecker();
    }

    public boolean isDividedBy(int divider){
        return this.number % divider == 0;
    }

    public String fizzBuzzChecker(){
        if(this.isDividedBy(15)) return "FizzBuzz";
        if(this.isDividedBy(5)) return "Buzz";
        if(this.isDividedBy(3)) return "Fizz";
        return Integer.toString(this.getNumber());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
