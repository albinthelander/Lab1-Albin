import org.junit.Test;
import java.awt.*;

public class CarTest {

    @Test
    public void testNrDoors() {
        Car volvo = new Volvo240();
        volvo.getNrDoors();
    }

    @Test
    public void testGetEnginePower(){
        Car volvo = new Volvo240();
        volvo.getEnginePower();
    }

    @Test
    public void testGetCurrentSpeed(){
        Car volvo = new Volvo240();
        volvo.getCurrentSpeed();
    }

    @Test
    public void testGetColor() {
        Car volvo = new Volvo240();
        volvo.getColor();
    }

    @Test
    public void testSetColor() {
        Car volvo = new Volvo240();
        volvo.setColor(Color.green);
    }

    @Test
    public void testIncrementSpeed(){
        Car volvo = new Volvo240();
        volvo.incrementSpeed(0.5);
    }

    @Test
    public void testDecrementSpeed(){
        Car saab = new Saab95();
        saab.decrementSpeed(0.5);
    }

    @Test
    public void testStartEngine(){
        Car volvo = new Volvo240();
        volvo.startEngine();

    }

    @Test
    public void testStopEngine(){
        Car volvo = new Volvo240();
        volvo.stopEngine();
    }

    @Test
    public void testMove(){
        Car volvo = new Volvo240();
        volvo.move();
    }

    @Test
    public void testTurnLeft(){
        Car volvo = new Volvo240();
        volvo.turnLeft();
    }

    @Test
    public void testTurnRight(){
        Car volvo = new Volvo240();
        volvo.turnRight();
    }

    @Test
    public void testGas(){
        Car volvo = new Volvo240();
        volvo.gas(0.3);
    }

    @Test
    public void testBreak(){
        Car volvo = new Volvo240();
        volvo.brake(0.3);
    }

    @Test
    public void testTurboOn() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
    }

    @Test
    public void testTurboOff(){
        Saab95 saab = new Saab95();
        saab.setTurboOff();
    }
}
