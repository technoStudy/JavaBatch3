package technoStudy.Day12;

import java.util.Scanner;

public class _01_Task3withIf {
    // ask the user for pin number
    // if the pin number is incorrect keep asking the user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787
    public static void main(String[] args) {
        System.out.println("Please enter pin number: ");
        int correctPin = 8787;

        Scanner sc = new Scanner(System.in);
        int userPin = sc.nextInt();

        if (userPin == correctPin) {
            System.out.println("you are logged in");
        }

    }
}
