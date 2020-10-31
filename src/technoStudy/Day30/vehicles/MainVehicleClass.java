package technoStudy.Day30.vehicles;

public class MainVehicleClass {
    public static void main(String[] args) {
        Car ferrari = new Car("Ferrari", null, "red");
        ferrari.installEngine(500, 2020);
        ferrari.printProperties();

        Engine engine = new Engine();
        engine.horsePower = 1500;
        engine.model = 2015;

        Truck truck = new Truck("Truck", null, "black", engine);
        truck.printProperties();
    }
}


