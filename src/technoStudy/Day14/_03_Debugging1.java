package technoStudy.Day14;

import java.util.Scanner;

public class _03_Debugging1 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(number);
        number++;
        System.out.println(number);
        if(number > 1) {
            System.out.println("Larger than 1");
        } else {
            System.out.println("Less than 1");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("After the loop");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input);
    }
}

