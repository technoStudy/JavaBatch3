package technoStudy.Day10;

import java.util.Scanner;

public class Task2 {
    // get string input from the user
    // if it contains 'a' and 'b', print "The input contains both a and b"
    // else print "The input does not contains both a and b"


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

//        if (line.contains("a") && line.contains("b")) {
//            System.out.println("The input contains both a and b");
//        } else {
//            System.out.println("The input does not contains both a and b");
//        }

        String output;
        if (line.contains("a") && line.contains("b")) {
            output = "contains";
        } else {
            output = "does not contains";
        }

        System.out.println("The input " + output + " both a and b");

    }
}
