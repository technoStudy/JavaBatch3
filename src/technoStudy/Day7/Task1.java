package technoStudy.Day7;

import java.util.Scanner;

public class Task1 {
    // create a program that ask for you name, age and height, print out this information
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.println("Enter your height: ");
        float height = scanner.nextFloat();

        System.out.println("Your information: ");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);

    }
}
