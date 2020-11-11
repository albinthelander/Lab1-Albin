import java.awt.*;

public class Volvo240 extends Car {

    /**
     * states what the trim factor is
     */
    private static double trimFactor = 1.25;

    /**
     * creates an object of type volvo240
     */
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    /**
     * Determines the speed factor
     */
    double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

}