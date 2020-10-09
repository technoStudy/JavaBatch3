package technoStudy.Day14;

import java.util.Scanner;

public class _02_LabelLoopsTask1 {
    // get a string from the user 3 strings
    // print each string character in the same line, skip spaces

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String userString = scanner.nextLine();
        String userString; // variable declaration

        // for-loop
        outer:
        for (int i = 0; i < 3; i++) { // outer
            System.out.println(i);
            userString = scanner.nextLine(); // variable assignment
            for (int j = 0; j < userString.length(); j++) { // inner
                char charAt = userString.charAt(j);
                if (charAt == ' ') {
                    continue;
                }
                if (charAt == ';') {
                    System.out.println();
                    break outer;
                }
                System.out.print(charAt);
            }
            System.out.println();
            // for-loop
        }

        System.out.println("After the outer loop");
    }
}
