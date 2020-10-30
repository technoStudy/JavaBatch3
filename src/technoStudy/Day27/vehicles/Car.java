package technoStudy.Day27.vehicles;

public class Car {
    String name;
    String model;
    String color;
    Engine engine;

    public void printProperties() {
        System.out.println("Name: " + name + " Model: " + model + " Color: " + color);
        engine.printProperties();
    }

    public void installEngine(int horsePower, int model) {
        Engine newEngine = new Engine();
        newEngine.horsePower = horsePower;
        newEngine.model = model;

        engine = newEngine;
    }
}
