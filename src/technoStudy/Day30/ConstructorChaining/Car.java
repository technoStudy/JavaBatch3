package technoStudy.Day30.ConstructorChaining;

public class Car {
    String model;
    int year;

    public Car() {
        this("Year not defined", 1965); // this must be first line and you can only call one
//        this(1999);
    }

    public Car(int year) {
        this("Year not defined", year);
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
