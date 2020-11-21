package technoStudy.Day42.task1;

public class Demo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move(10);
        System.out.println(car.getName());
        System.out.println(Car.getName());
    }
}
