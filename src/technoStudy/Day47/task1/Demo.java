package technoStudy.Day47.task1;

public class Demo {
    public static void main(String[] args) {
        Car car1 = new SimpleCar();
        car1.start();
        car1.drive();
        car1.stop();

        Car car2 = new ExpensiveCar();
        car2.start();
        car2.drive();
        car2.stop();
    }
}
