package technoStudy.Day14;

import java.util.Scanner;

public class _01_NestedLoopTask2 {
    // Write a program that prompts user for 3 integer between 0-100. -> for-loop
    // keep asking until you get correct integers -> do-while
    // print out the average of these 3 integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        for (int i = 0; i < 3; i++) { // while
            do {
                System.out.println("("+(i+1)+") Enter an integer between 0-100");
                number = scanner.nextInt();
            } while (number < 0 || number > 100); // keep asking if the number is less than 0 or larger than 100;
            sum = sum + number;
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + sum/3);


    }
}
