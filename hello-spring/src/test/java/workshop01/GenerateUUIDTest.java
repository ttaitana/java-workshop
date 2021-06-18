package workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateUUIDTest {
    @Test
    public void getUUID(){
        GenerateUUID generateUUID = new GenerateUUID();
        String uuid = generateUUID.getUUID("Taitana");
        String expectedValue = "XYZTaitana" + generateUUID.getUUIDNumber();
        assertEquals(expectedValue, uuid);
    }
}