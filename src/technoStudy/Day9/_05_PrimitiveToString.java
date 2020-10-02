package technoStudy.Day9;

public class _05_PrimitiveToString {
    // primitives are automatically converted to Strings when needed
    // examples: concatenation, printing to System.out
    // but we can manually convert a primitive to a string if we need to
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(x);
        System.out.println(y);

        System.out.println("X is " + x);

        System.out.println(x + y); // what if I expect 12 here
        System.out.println("" + x + y); // one way to print 12
        System.out.println(Integer.toString(x) + Integer.toString(y)); // another way to print 12

        String xString = Integer.toString(x);
        String yString = Integer.toString(y);

        System.out.println(xString + yString);

        double a = 1.1;
        double b = 2.2;
        System.out.println(a);
        System.out.println(b);

        System.out.println("A is " + a);

        System.out.println(a + b); // what if I expect 1.12.2 here
        System.out.println("" + a + b); // one way to print 1.12.2
        System.out.println(Double.toString(a) + Double.toString(b)); // another way to print 1.12.2

        String aString = Double.toString(a);
        String bString = Double.toString(b);

        System.out.println(aString + bString);
    }
}

