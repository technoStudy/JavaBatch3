package technoStudy.Day7;

import java.util.Scanner;

public class _03_GettingBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a cat person? (Answer true or false)");
        boolean aBoolean = scanner.nextBoolean(); // only accepts true or false
        System.out.println("You are a cat person -> " + aBoolean);
    }
}
