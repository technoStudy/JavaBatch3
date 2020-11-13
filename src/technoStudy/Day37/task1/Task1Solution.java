package technoStudy.Day37.task1;

import java.util.Scanner;

public class Task1Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Integer output = convertToInteger(input);

        System.out.println(output);
    }

    private static Integer convertToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Could not convert to integer, giving default value of 0!");
            return 0;
        }
    }
}
