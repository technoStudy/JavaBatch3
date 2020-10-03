package technoStudy.Day11;

import java.util.Random;
import java.util.Scanner;

public class Task22 {
    // get random number from 1 to 5
    // print "ok" if number is 5 and print "you win you guessed 5"
    // print "no" if number is 3 and print "you lose, you guessed 3"
    // print "excellent" if number is 1 and print "you win, you guessed 1"
    // print "dunno, did not recognize the number" if anything else
    // use switch case
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;

        switch (randomNumber) {
            case 5:
                System.out.println("ok");
                System.out.println("you win you guessed 5");
                break;
            case 3:
                System.out.println("no");
                System.out.println("you lose, you guessed 3");
                break;
            case 1:
                System.out.println("excellent");
                System.out.println("you win, you guessed 1");
                break;
            default:
                System.out.println("dunno, did not recognize the number");
        }
    }
}
