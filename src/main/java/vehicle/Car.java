package vehicle;

public class Car extends Vehicle implements Driveable{
    @Override
    public void move() {
        drive();
    };

}
