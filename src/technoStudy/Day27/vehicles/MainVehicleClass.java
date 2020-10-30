package technoStudy.Day27.vehicles;

public class MainVehicleClass {
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.name = "Ferrari";
        ferrari.color = "red";
        ferrari.installEngine(500, 2020);
        ferrari.printProperties();

        Truck truck = new Truck();
        truck.name = "Truck";
        truck.color = "black";
        truck.printProperties();

        truck.engine = new Engine();
        truck.engine.horsePower = 1500;
        truck.engine.model = 2015;
    }
}


