package technoStudy.Day7;

import java.util.Scanner;

public class _05_CastingIntegral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte someByte = (byte) scanner.nextLong(); // long can accept big numbers
        System.out.println(someByte);
    }
}
