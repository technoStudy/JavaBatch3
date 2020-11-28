package technoStudy.Day45.task1;

public class Tesla extends Car implements Electric {
    public Tesla(String model, int year) {
        super(model, year);
    }

    @Override
    public void changeBattery() {
        System.out.println("Change every 20 000 miles");
    }
}
