package technoStudy.Day13;

public class _04_Task3 {
    // print the multiplication table for all numbers from 1 to 10
    public static void main(String[] args) {
        for (int multiplicand = 1; multiplicand <= 10; multiplicand++) {
            System.out.println("---------------------------------------");
            for (int number = 1; number <= 10; number++) {
                System.out.println(multiplicand + " x " + number + " = " + multiplicand * number);
            }
        }
    }
}
