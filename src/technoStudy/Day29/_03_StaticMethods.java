package technoStudy.Day29;

public class _03_StaticMethods {
    public static void main(String[] args) {
        CarWithStaticMethod.print();

        CarWithStaticMethod car = new CarWithStaticMethod();
        car.printInstance();
        car.printInstance2();

        car.print2(); // redundant, not recommended
        CarWithStaticMethod.print2(); // recommended way to call static methods
    }

}
