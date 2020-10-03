package technoStudy.Day11;

import java.util.Scanner;

public class Task23 {
    /*
     Write a Java program to evaluate exam result of student
     get a letter from user
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
    anything else -> Wrong Input
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputFromUser = sc.nextLine();
        char letter = inputFromUser.charAt(0);

        switch (letter) {
            case 'A':
                System.out.println("Excellent!!!");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Need improvement");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
