package technoStudy.Day11;

import java.util.Random;
import java.util.Scanner;

public class Task24 {
    /*
     Write a Java program to evaluate exam result of student
     generate a random letter
    ex:
    'A'-> Excellent!!!
    'B', 'C' -> Good
    'D'-> Need improvement
    'F'-> Fail
    anything else -> Wrong Input
     */
    public static void main(String[] args) {
        String inputFromUser = "ABCDF";
        Random random = new Random();
        char letter = inputFromUser.charAt(random.nextInt(inputFromUser.length() - 1)); // index here from 0 until inputFromUser.length()-1

        switch (letter) {
            default:
                System.out.println("Wrong Input");
                break;
            case 'A':
                System.out.println("Excellent!!!");
                break;
            case 'B': // in case b
            case 'C': // or c
                System.out.println("Good"); // do this
                break;
            case 'D':
                System.out.println("Need improvement");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }
}
