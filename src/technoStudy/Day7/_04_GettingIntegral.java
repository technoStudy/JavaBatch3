package technoStudy.Day7;

import java.util.Scanner;

public class _04_GettingIntegral {
    public static void main(String[] args) {
        Scanner integralScanner = new Scanner(System.in);

        System.out.println("Enter some byte: ");
        byte someByte = integralScanner.nextByte();

        System.out.println("Enter some short: ");
        short someShort = integralScanner.nextShort();

        System.out.println("Enter some int");
        int someInt = integralScanner.nextInt();

        System.out.println("Enter some long");
        long someLong = integralScanner.nextLong();

        System.out.println("byte: " + someByte);
        System.out.println("short: " + someShort);
        System.out.println("int: " + someInt);
        System.out.println("long: " + someLong);

    }
}
