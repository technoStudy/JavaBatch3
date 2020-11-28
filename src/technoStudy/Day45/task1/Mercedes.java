package technoStudy.Day45.task1;

public class Mercedes extends Car implements Diesel {
    public Mercedes(String model, int year) {
        super(model, year);
    }

    @Override
    public void changeOil() {
        System.out.println("Change every 50 000 miles");
    }
}
