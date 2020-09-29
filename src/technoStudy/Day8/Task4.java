package technoStudy.Day8;

public class Task4 {
    // Write a Java program that calculate average of following numbers
    // 23.4, 24.0, 12, 450.3, 23000

    // part2: assign the numbers to variables first

    public static void main(String[] args) {
        double a = 23.4;
        double b = 24.0;
        byte c = 12;
        double d = 450.3;
        short e = 23000;

        double sum = a + b + c + d + e;
        double average = sum / 5;

        System.out.println(average);
    }
}
