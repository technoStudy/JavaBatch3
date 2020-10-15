package technoStudy.Day19;

public class _01_Method2_Overloading_Task {
    // create a multiply method, that takes two integers and returns their product as integer
    // create a multiply method, that takes three integers and returns their product as integer
    // create a multiply method, that takes two doubles and returns their product as double
    // create a multiply method, that takes three doubles and returns their product as double
    // create a multiply method, that takes one double and one integer and returns their product as double
    // create a multiply method, that takes one integer and one double and returns their product as integer
    public static void main(String[] args) {
        int multiplyOfTwo = multiply(1, 2);
        System.out.println(multiplyOfTwo);
        int multiplyOfThree = multiply(1, 2, 3);
        System.out.println(multiplyOfThree);

        double doubleMultiply = multiply(1.1, 11.1);
        System.out.println(doubleMultiply);
        double doubleMultiplyOfThree = multiply(1.1, 1.1, 2.2);
        System.out.println(doubleMultiplyOfThree);

        double aDouble = multiply(1.2, 1);
        System.out.println(aDouble);
        int anInteger = multiply(1, 1.2);
        System.out.println(anInteger);
    }

    public static int multiply(int a, int b) { // signature of method
        System.out.println("using method 1");
        return a * b;
    }

    // number of parameters different
    public static int multiply(int a, int b, int c) { // different signature of method
        System.out.println("using method 2");
        return a * b * c;
    }

    // type of parameters different
    public static double multiply(double a, double b) { // different signature of method
        System.out.println("using method 3");
        return a * b;
    }
    
    // type and number of parameters different
    public static double multiply(double a, double b, double c) { // different signature of method
        System.out.println("using method 4");
        return a * b * c;
    }

    // different order of parameters
    public static double multiply(double a, int b) { // different signature of method
        System.out.println("using method 5");
        return  a * b;
    }

    // different order of parameters
    public  static int multiply(int a, double b) { // different signature of method
        System.out.println("using method 6");
        return (int) (a * b);
    }
}
