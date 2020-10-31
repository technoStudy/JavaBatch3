package technoStudy.Day30.ConstructorChaining;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car();
        System.out.println(defaultCar.year);
        System.out.println(defaultCar.model);

        Car carWithYear = new Car(2000);
        System.out.println(carWithYear.year);
        System.out.println(carWithYear.model);
    }
}
