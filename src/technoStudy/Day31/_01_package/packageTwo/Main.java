package technoStudy.Day31._01_package.packageTwo;

import technoStudy.Day31._01_package.packageOne.*; // everything from packageOne

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari");
        Truck truck = new Truck();

//        Plane plane = new Plane(); // not available because is package-private, the access modifier of this class is default
    }
}
