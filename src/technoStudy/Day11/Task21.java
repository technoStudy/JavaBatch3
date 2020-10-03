package technoStudy.Day11;

import java.util.Scanner;

public class Task21 {
    // get number from the user
    // print "ok" if number is 5
    // print "maybe" if number is 3
    // print "no" if number is 1
    // print "dunno" if anything else
    // use switch case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("no");
                break;
            case 3:
                System.out.println("maybe");
                break;
            case 5:
                System.out.println("yes");
                break;
            default:
                System.out.println("dunno");
        }
    }
}
