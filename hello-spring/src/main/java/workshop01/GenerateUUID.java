package workshop01;

import java.util.Random;

public class GenerateUUID {
    public String getUUID(String name){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        String id = "XYZ" + name + randomNumber;
        return id;
    }
}
