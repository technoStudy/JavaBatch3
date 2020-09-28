package technoStudy.Day7;

import java.util.Scanner;

public class Task4 {
    // Create a check splitter calculator
    // ask user for check total
    // ask user for number of friends
    // print the amount per friend to be split and payed
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is check splitter calculator");
        System.out.println("Enter check total");
        double checkTotal = scanner.nextDouble();
        System.out.println("Enter the number of friends");
        int friends = scanner.nextInt();

        double perFriend = checkTotal / friends;

        System.out.println("The amount per friend is: " + perFriend);
    }
}
