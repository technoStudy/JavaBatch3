package technoStudy.Day45.task2;

public class Plane implements Vehicle, Flying {

    @Override
    public void printGroundSpeed() {
        System.out.println("600 mph");
    }

    @Override
    public void fly() {
        System.out.println("Take off and fly");
    }
}
