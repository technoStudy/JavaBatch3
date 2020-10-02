package technoStudy.Day10;

public class _04_MathClass {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println( Math.abs( c ) );
        System.out.println( Math.max( a, c ) );
        System.out.println( Math.min( a, c ) );

        // for math round, the round direction is automatic, down of less than half, and up if equal or larger than half
        System.out.println( Math.round( 3.4 )); // returns long
        System.out.println( Math.round( 3.5 ));
        System.out.println( Math.round( 3.6 ));

        // for math ceil, the round direction is up only
        System.out.println( Math.ceil( 3.4 )); // returns double
        System.out.println( Math.ceil( 3.5 ));
        System.out.println( Math.ceil( 3.6 ));

        // for math floor, the round direction is down only
        System.out.println( Math.floor( 3.4 )); // returns double
        System.out.println( Math.floor( 3.5 ));
        System.out.println( Math.floor( 3.6 ));

        System.out.println( Math.sqrt( 16 ));  // returns double
        System.out.println( Math.pow( 4, 2 )); // returns double

        System.out.println( Math.random() ); // returns double, between 0 and 1
    }
}
