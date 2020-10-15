package technoStudy.Day19;

public class _01_Method2_Overloading {
    public static void main(String[] args) {
        int sumOfTwo = sum(1, 2);
        System.out.println(sumOfTwo);
        int sumOfThree = sum(1, 2, 3);
        System.out.println(sumOfThree);

        double doubleSum = sum(1.1, 11.1);
        System.out.println(doubleSum);

        double aDouble = sum(1.2, 1);
        System.out.println(aDouble);
        int anInteger = sum(1, 1.2);
        System.out.println(anInteger);
    }

    public static int sum(int a, int b) { // signature of method
        System.out.println("using method 1");
        return a + b;
    }

    // number of parameters different
    public static int sum(int a, int b, int c) { // different signature of method
        System.out.println("using method 2");
        return a + b + c;
    }

    // type of parameters different
    public static double sum(double a, double b) { // different signature of method
        System.out.println("using method 3");
        return a + b;
    }

    // different order of parameters
    public static double sum(double a, int b) { // different signature of method
        System.out.println("using method 4");
        return  a + b;
    }

    // different order of parameters
    public  static int sum(int a, double b) { // different signature of method
        System.out.println("using method 5");
        return (int) (a + b);
    }
}
