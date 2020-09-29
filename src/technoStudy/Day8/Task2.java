package technoStudy.Day8;

import java.util.Scanner;

public class Task2 {
    // create a program that subtracts a number from 100
    // this number must come from user input (Scanner(System.in))
    public static void main(String[] args) {
        int theHundred = 100;

        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();

        System.out.println(theHundred - numberFromUser);
    }
}
