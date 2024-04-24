public class Car {
    String brand;
    String model;
    String color;
    boolean engine;
    int speed;

    public boolean startStopCar(){
        return engine = !engine;
    }

    public void increaseSpeed(){
        speed += 100;
    }
    public void decreaseSpeed(){
        speed -= 100;
    }
}
