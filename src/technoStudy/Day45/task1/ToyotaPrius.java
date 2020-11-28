package technoStudy.Day45.task1;

public class ToyotaPrius extends Car implements Electric, Diesel {
    public ToyotaPrius(String model, int year) {
        super(model, year);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 10 000 miles");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change batter every 15 000 miles");
    }
}
