package technoStudy.Day10;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    // ask number from user between  0  and 5
    // generate a random number
    // check if the user number and random number are equal
    // if equals print "you win" else "you lose"
    public static void main(String[] args) {
        System.out.println("Please enter number between  0  and 5");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(5);

        if(number == randomNumber) {
            System.out.println("you win");
        } else {
            System.out.println("you lose");
        }
    }
}
