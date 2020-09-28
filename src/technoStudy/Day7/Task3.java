package technoStudy.Day7;

import java.util.Scanner;

public class Task3 {
    // Print "Enter 3 numbers to be multiplied"
    // ask for 3 numbers, multiply them and print out the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers to be multiplied");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        System.out.println("The result is: " + (firstNumber * secondNumber * thirdNumber));
    }
}
