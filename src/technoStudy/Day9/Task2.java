package technoStudy.Day9;

import java.util.Scanner;

public class Task2 {
    // get a number from the user
    // check if it is positive or negative
    // part2: check for zero also
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // part 1
        if(number > 0) {
            System.out.println("positive");
        }

        if(number < 0) {
            System.out.println("negative");
        }

        // part2
        if (number == 0){
            System.out.println("zero");
        }
    }
}
