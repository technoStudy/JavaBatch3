package technoStudy.Day11;

import java.util.Random;

public class Task32 {
    // get a random number from 0 to 5
    // if number larger than 2, get another random number and check if it's larger that 3, print "you win" else you lose
    // else print, first number too low to play
    public static void main(String[] args) {
        Random random = new Random();

        int money = random.nextInt(5);
        System.out.println("your money: " + money);
        if(money > 2) {
            // we can play
            int yourLuckyNumber = random.nextInt(5);
            System.out.println("your lucky number: " + yourLuckyNumber);
            if(yourLuckyNumber > 3) {
                System.out.println("you win");
            } else {
                System.out.println("you lose");
            }
        } else {
            System.out.println("you money too low to play");
        }
    }
}
