package technoStudy.Day30.vehicles;

public class Truck {
    String name;
    String model;
    String color;
    int numberOfTrailers;
    Engine engine;

    public Truck(){}
    public Truck(String name){ this.name = name; }
    public Truck(String name, String model) { this.name= name; this.model = model;}
    public Truck(String name, String model, String color) { this.name= name; this.model = model; this.color = color;}

    public Truck(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Truck(String name, String model, Engine engine) {
        this.name = name;
        this.model = model;
        this.engine = engine;
    }

    public Truck(String name, String model, String color, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public Truck(String name, String model, String color, int numberOfTrailers, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.numberOfTrailers = numberOfTrailers;
        this.engine = engine;
    }

    public void printProperties() {
        System.out.println("Name: " + name + " Model: " + model + " Color: " + color);
    }
}
