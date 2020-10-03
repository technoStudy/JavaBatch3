package technoStudy.Day11;

import java.util.Scanner;

public class Task31 {
    // get 2 numbers from user
    // if first number is larger than zero, check second number, if second number is larger than 5 print "ok" else print "not ok"
    // if first number is less than or equal to zero, print "too cold to check"

    // think of the first number as temperature
    // second number is atmospheric pressure
    // and your code is doing diagnostics

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        int pressure = sc.nextInt();

        if(temperature > 0) {
            // temperature is ok, we can check the pressure
            if(pressure > 5) {
                System.out.println("ok");
            }
            else {
                System.out.println("not ok");
            }
        } else { // (temperature <= 0)
            // temperature is zero or below
            System.out.println("too cold to check");
        }
    }
}
