package technoStudy.Day7;

import java.util.Scanner;

public class Task2 {
    // print out "Enter two numbers to get their sum"
    // Ask user for two numbers, add them and output the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to get their sum");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println("Result: " + firstNumber + secondNumber);  // wrong
        System.out.println("Result: " + (firstNumber + secondNumber)); // correct 1

        double result = firstNumber + secondNumber; // correct 2
        System.out.println("Result: " + result); // correct 2
    }
}
