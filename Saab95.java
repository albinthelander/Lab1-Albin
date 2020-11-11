import java.awt.*;

public class Saab95 extends Car {

    /**
     * shows if the turbo is on or off
     */
    private boolean turboOn;

    /**
     * creates an object of type Saab95
     */
    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    /**
     * Determines the speed factor
     */
    double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    void setTurboOn(){
	    turboOn = true;
    }
    void setTurboOff(){
        turboOn = false;
    }


}