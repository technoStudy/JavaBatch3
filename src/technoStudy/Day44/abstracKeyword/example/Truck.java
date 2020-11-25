package technoStudy.Day44.abstracKeyword.example;

public class Truck extends Vehicle {
    @Override
    public void move(int distance) {
        System.out.println("The truck is moving");
    }

    @Override
    public void move(int distance, String units) {

    }

    @Override
    public void fuelUp(int liters) {

    }
}
