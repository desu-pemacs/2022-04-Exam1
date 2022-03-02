import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class BearTest {
    private static final String[] bearTypes = {"Kodiak","Polar","Panda","Grizzly"};
    private static Random rand = new Random();

    @Test
    void defaultConstructor(){
        Bear bear = new Bear();
        assertEquals("Kodiak:96.0", bear.toString());
    }

    @Test
    void valueConstructor(){
        String type = bearTypes[rand.nextInt(bearTypes.length)];
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Bear bear = new Bear(type,length);
        assertEquals(type+":"+length, bear.toString());
    }

    @Test
    void getType() {
        String type = bearTypes[rand.nextInt(bearTypes.length)];
        Bear bear = new Bear(type,80.5);
        assertEquals(type, bear.getType());
    }

    @Test
    void getHeightInInches() {
        String type = bearTypes[rand.nextInt(bearTypes.length)];
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Bear bear = new Bear(type,length);
        assertEquals(length, bear.getHeightInInches());
    }

    @Test
    void getHeightInCentiMeters() {
        String type = bearTypes[rand.nextInt(bearTypes.length)];
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Bear bear = new Bear(type,length);
        assertEquals(length*2.54, bear.getHeightInCentiMeters());
    }

    @Test
    void setType() {
        Bear bear = new Bear();
        String type = bearTypes[rand.nextInt(bearTypes.length)];
        bear.setType(type);
        assertEquals(type+":96.0", bear.toString());
    }

    @Test
    void setHeight() {
        Bear bear = new Bear();
        double length = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        bear.setHeight(length);
        assertEquals("Kodiak:"+length, bear.toString());
    }
}