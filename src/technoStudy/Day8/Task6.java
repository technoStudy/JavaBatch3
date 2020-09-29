package technoStudy.Day8;

import java.util.Scanner;

public class Task6 {
    // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    // c = (f-32) * 5/9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit-32) * 5/9;
        System.out.println(celsius);
    }
}
