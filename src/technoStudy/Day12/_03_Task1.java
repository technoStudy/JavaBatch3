package technoStudy.Day12;

import java.util.Scanner;

public class _03_Task1 {
    // ask the user for pin number
    // if the pin number is incorrect keep asking the user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787
    // do this task with do-while
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  correctPin =  8787;
        int userPin = 0;

        do {
            System.out.println("Pin incorrect, try again!"); // because it's guaranteed to execute at least once, you will see this message at the beginning
            userPin = scanner.nextInt();
        } while (userPin != correctPin);

        System.out.println("You are logged in");
    }
}
