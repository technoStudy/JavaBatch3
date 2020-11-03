package technoStudy.Day31._01_package.packageOne;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        Truck truck = new Truck();

        // both classes available because they are in the same package as Main

        Plane plane = new Plane();
    }
}
