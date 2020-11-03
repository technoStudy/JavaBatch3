package technoStudy.Day31._02_instanceModifiers.protectedModifier.other;

import technoStudy.Day31._02_instanceModifiers.protectedModifier.same.Car;

public class CarSubClass extends Car {
    public static void main(String[] args) {
//        Car car = new Car();
        CarSubClass car = new CarSubClass();
        String name = car.name;
        String name1 = car.getName();
    }

}
