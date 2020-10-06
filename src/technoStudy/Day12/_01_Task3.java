package technoStudy.Day12;

import java.util.Scanner;

public class _01_Task3 {
    // ask the user for pin number
    // if the pin number is incorrect keep asking the user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter pin number: ");
        int correctPin = 8787;
        int userPin = sc.nextInt();

        while (userPin != correctPin) { // it will only stop when user pin equal correct pin
            // if we are here, this means that userPin != correctPin
            System.out.println("Incorrect pin, please try again! ");
            userPin = sc.nextInt();
        }
        // if we are here this mean that userPin == correctPin
        System.out.println("you are logged in");

    }
}
