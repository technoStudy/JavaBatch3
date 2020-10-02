package technoStudy.Day9;

import java.util.Scanner;

public class Task4 {
    // accept some number from user using scanner.nextLine()
    // check if the number is greater than 100
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String number = scanner.nextLine();

        int theNumber = Integer.parseInt(number);

        if(theNumber > 100) {
            System.out.println("The number is greater than 100");
        }
    }
}
