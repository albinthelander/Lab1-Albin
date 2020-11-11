public class CarMain {

    public static void main(String[] args){

        Saab95 gamlaSaaben = new Saab95();
        gamlaSaaben.startEngine();
        gamlaSaaben.move();
        gamlaSaaben.turnLeft();
        gamlaSaaben.move();
        gamlaSaaben.move();
        gamlaSaaben.getCoordinates();

    }
}
