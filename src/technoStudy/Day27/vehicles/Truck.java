package technoStudy.Day27.vehicles;

public class Truck {
    String name;
    String model;
    String color;
    int numberOfTrailers;
    Engine engine;


    public void printProperties() {
        System.out.println("Name: " + name + " Model: " + model + " Color: " + color);
    }
}
