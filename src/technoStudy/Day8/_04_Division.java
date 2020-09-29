package technoStudy.Day8;

public class _04_Division {
    public static void main(String[] args) {
        // Division using just values
        System.out.println( 4 / 2 );

        // Multiplication using variables
        int divisor = 2;
        System.out.println( 5 / divisor ); // both of the value and variable are of int type
        int intResult = 5 / divisor; // that's why the result is also int
        double result = 5.0 / divisor; // if one of them is double, the result is promoted to double
        double result2 = 5 / 2.0;
        System.out.println(result);
        System.out.println(result2);
    }
}
