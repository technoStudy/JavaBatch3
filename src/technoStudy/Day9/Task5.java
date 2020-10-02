package technoStudy.Day9;

import java.util.Scanner;

public class Task5 {
    // get two integers from user using nextInt()
    // concatenate them together
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String xString = Integer.toString(x);
        String yString = Integer.toString(y);

        System.out.println(xString.concat(yString));
    }
}
