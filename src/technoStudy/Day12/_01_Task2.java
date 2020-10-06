package technoStudy.Day12;

import java.util.Scanner;

public class _01_Task2 {
    // get a number from user
    // print the sum of numbers from 0 up to number from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;
        int count = 0;
        while(count < number) {
            ++count; // 1, 2, 3
//            System.out.println("count is currenlty: " + count);
            sum = sum + count; // 1, 3, 6
//            System.out.println("sum is currenlty: " + sum);
        }

        System.out.println(sum);

    }
}
