package technoStudy.Day9;

public class _01_ComparisonOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;

        System.out.println("Equal");
        System.out.println(a==b);
        System.out.println(a==c);

        System.out.println("Not equal");
        System.out.println(a!=b);
        System.out.println(a!=c);

        System.out.println("Greater than");
        System.out.println(a>b);
        System.out.println(a>c); // even though they are equal this will still give false

        System.out.println("Less than:");
        System.out.println(a<b);
        System.out.println(a<c); // even though they are equal this will still give false

        System.out.println("Greater than or equal:");
        System.out.println(a>=b);
        System.out.println(a>=c);

        System.out.println("Less than or equal:");
        System.out.println(a<=b);
        System.out.println(a<=c);

        boolean aLessThanOrEqual = a <= b;
        System.out.println("aLessThanOrEqual: " + aLessThanOrEqual);
    }
}
