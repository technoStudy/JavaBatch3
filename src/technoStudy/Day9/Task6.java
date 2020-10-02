package technoStudy.Day9;

import java.util.Scanner;

public class Task6 {
    // get input from the user as string
    // get the sum of first and last numbers and print it out
    // Example input: "12 1 23 4". Example output : "16".
    // Example input: "11 1 23 44". Example output : "55".
    // Example input: "1 23". Example output : "24".
    // Example input: "1 23 2". Example output : "3".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int firstIndexOfSpace = input.indexOf(' '); // first index of space character
        String firstWord = input.substring(0, firstIndexOfSpace);
        int firstNumber = Integer.parseInt(firstWord);

        int indexOfLastSpace = input.lastIndexOf(' ');
        String lastWord = input.substring(indexOfLastSpace + 1);
        int lastNumber = Integer.parseInt(lastWord);

        System.out.println("the sum of first and last numbers: " +  (firstNumber + lastNumber));
    }
}
