package technoStudy.Day10;

import java.util.Scanner;

public class Task3 {
    // get a number from the user
    // if the number is larger than 100: print out "The number is larger than 100"
    // if the number is smaller than 100: print out "The number is smaller than 100"
    // use Ternary operator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        System.out.println("The number is "+ (number > 100 ? "larger" : "smaller") +" than 100");
        String result = number > 100 ? "larger" : "smaller";
        System.out.println("The number is "+ result +" than 100");
    }
}
