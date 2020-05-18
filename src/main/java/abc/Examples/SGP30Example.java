package abc.Examples;


import abc.SGP30;
import com.pi4j.io.i2c.I2CFactory;

import java.io.IOException;

public class SGP30Example {
    public static void main(String[] args) throws InterruptedException, IOException, I2CFactory.UnsupportedBusNumberException {
        SGP30 sgp30 = new SGP30();
        while (true){
            Thread.sleep(500);
            System.out.printf("eCO2 = %d ppm TVOC = %d \n", sgp30.getECO2(), sgp30.getBaseLineTVOC());
        }
    }
}
