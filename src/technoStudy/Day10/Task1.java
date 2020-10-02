package technoStudy.Day10;

import java.util.Scanner;

public class Task1 {
    // get string input from the user
    // check if it contains 'a' and 'b'
    // check if it contains 'a' or 'c'
    // check if it does NOT contain 'c'
    // check if it does not contain both 'c' and 'd'
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println( line.contains("a") && line.contains("b") );
        System.out.println( line.contains("a") || line.contains("c"));
        System.out.println( !line.contains("c") );

        System.out.println( !( line.contains("c") && line.contains("d") ) );

    }
}
