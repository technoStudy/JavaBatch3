package technoStudy.Day13;

import java.util.Scanner;

public class _02_Task1 {
    // get a string from the user
    // using for-loop print each letter in a new line
    // part2: stop if you encounter space character
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if(letter == ' ') {
                break;
            }
            System.out.println(letter);
        }
    }
}
