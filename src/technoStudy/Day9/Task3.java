package technoStudy.Day9;

import java.util.Scanner;

public class Task3 {
    // Take two numbers from the user and print the greatest number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x =  scanner.nextInt();
        int y =  scanner.nextInt();

        if(x > y) {
            System.out.println("The greatest number is:");
            System.out.println(x);
        }

        if(y > x) {
            System.out.println("The greatest number is:");
            System.out.println(y);
        }

        if(y == x) {
            System.out.println("Can not determine the greatest number because they are equal!");
        }
    }
}
