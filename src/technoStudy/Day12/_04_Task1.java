package technoStudy.Day12;

import java.util.Scanner;

public class _04_Task1 {
    // get number from user
    // count from 0 until the number
    // if the count is larger than 10, stop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        int count = 0;
        while (count < number) {
            count++;
            System.out.println(count);
            if(count == 10) {
                break;
            }
        }
    }
}
