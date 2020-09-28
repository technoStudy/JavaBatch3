package technoStudy.Day7;

import java.util.Scanner;

public class _06_GettingDecimals {
    public static void main(String[] args) {
        Scanner decimalScanner = new Scanner(System.in);

        System.out.println("Enter some float:");
        float someFloat = decimalScanner.nextFloat();

        System.out.println("Enter some double:");
        double someDouble = decimalScanner.nextDouble();

        System.out.println("You have entered: ");
        System.out.println(someFloat);
        System.out.println(someDouble);
    }
}
