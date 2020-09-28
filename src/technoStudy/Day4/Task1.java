package technoStudy.Day4;

public class Task1 {
    // create two variables , with data type long & double
    // part1: convert long variable to double variable
    // part2: convert double into long
    public static void main(String[] args) {
        // part1
        long longNumber = 64164;
        double doubleNumber = longNumber; // converting long into double
        System.out.println(doubleNumber);

        // part2
        double doubleNumber2 = 0.13151;
        long longNumber2 = (long) doubleNumber2; // converting double into long, requires casting
        System.out.println(longNumber2);
    }
}
