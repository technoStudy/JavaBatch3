package technoStudy.Day13;

import java.util.Scanner;

public class _03_Task1 {
    // get number from the user, print all the numbers from 0 to the number from user
    // skip even numbers using continue
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 0; i <= number; i++) {
            if( i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
