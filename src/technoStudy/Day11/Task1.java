package technoStudy.Day11;

import java.util.Scanner;

public class Task1 {
    // get number from the user
    // print "ok" if number is 1
    // print "maybe" if number is 2
    // print "no" if number is 3
    // print "dunno" if anything else
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("ok");
        } else if (number == 2) {
            System.out.println("maybe");
        } else if (number == 3) {
            System.out.println("no");
        } else {
            System.out.println("dunno");
        }

    }
}
