package technoStudy.Day8;

import java.util.Scanner;

public class Task5 {
    // take a number from user and increment it twice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();

//        numberFromUser++;
//        numberFromUser++;
        ++numberFromUser; // numberFromUser = numberFromUser + 1;
        ++numberFromUser; // numberFromUser = numberFromUser + 1;
        System.out.println(numberFromUser);
    }
}
