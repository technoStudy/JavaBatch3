package technoStudy.Day31._02_instanceModifiers.privateModifier.other;

import technoStudy.Day31._02_instanceModifiers.privateModifier.same.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1);
        car.printName();

        // below is not available because the are private
//        Car car = new Car();
//        String name = car.name;
//        String name1 = car.getName();
    }
}
