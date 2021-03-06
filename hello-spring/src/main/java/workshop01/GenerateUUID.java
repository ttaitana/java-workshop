package workshop01;

import java.util.Random;

public class GenerateUUID {
    UUIDRandom random = new UUIDRandom();
    public String getUUID(String name){
        int randomNumber = this.random.nextInt(10);
        this.random.setCurrentNumber(randomNumber);
        String id = "XYZ" + name + randomNumber;
        return id;
    }

    public int getUUIDNumber(){
        return this.random.getCurrentNumber();
    }
}

class UUIDRandom extends Random{
    private int currentNumber;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }
}
