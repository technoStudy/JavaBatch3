package technoStudy.Day10;

import java.util.Scanner;

public class Task4 {
    // get two numbers from user
    // print out using Math class the max, min
    // print out square root of the first number
    // print out the result of first number to the power of second number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(Math.max(firstNumber, secondNumber));
        System.out.println(Math.min(firstNumber, secondNumber));
        System.out.println(Math.sqrt(firstNumber));
        System.out.println(Math.pow(firstNumber, secondNumber));
    }
}
