package technoStudy.Day14;

import java.util.Scanner;

public class _01_NestedLoopTask1 {
    // Write a program that prompts user for an integer between 0-100.
    // keep asking until you get the integer in between 0-100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter an integer between 0-100");
            number = scanner.nextInt();
        } while (number < 0 || number > 100); // keep asking if the number is less than 0 or larger than 100;

        System.out.println("you number is " + number);
    }
}
