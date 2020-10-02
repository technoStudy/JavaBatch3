package technoStudy.Day9;

import java.util.Scanner;

public class Task1 {
    // get an int from user
    // if it is larger than 100, print "PASSED"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 100) {
            System.out.println("PASSED");
        }
    }
}
