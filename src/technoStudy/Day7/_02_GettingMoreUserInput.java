package technoStudy.Day7;

import java.util.Scanner;

public class _02_GettingMoreUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you first name:");
        String firstName = input.nextLine(); // will wait for user to type input and press enter, and it will assign it to firstName variable
        System.out.println("Your first name is: " + firstName);

        System.out.println("Please enter you last name:");
        String lastName = input.nextLine(); // will wait for user input again
        System.out.println("Your last name is: " + lastName);

    }
}
