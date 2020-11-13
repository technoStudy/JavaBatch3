package technoStudy.Day37.exceptionTypes;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.length();
        input.charAt(2);
        try {
            int length = input.length();
        } catch (Exception e) {
            System.out.println("cannot get input length");
        }

    }
}
