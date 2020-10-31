package technoStudy.Day30.vehicles;

public class Car {
    String name;
    String model;
    String color;
    Engine engine;

    public Car(){}
    public Car(String name){ this.name = name; }
    public Car(String name, String model) { this.name= name; this.model = model;}
    public Car(String name, String model, String color) { this.name= name; this.model = model; this.color = color;}

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Car(String name, String model, Engine engine) {
        this.name = name;
        this.model = model;
        this.engine = engine;
    }

    public Car(String name, String model, String color, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
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
