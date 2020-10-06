package technoStudy.Day13;

import java.util.Scanner;

public class _03_Task2 {
    // get text from the user, print each letter in a new line
    // skip space or semi-column characters
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);
            if(charAt == ' ' || charAt == ';') {
                continue;
            }
            System.out.println(charAt);
        }
    }
}
