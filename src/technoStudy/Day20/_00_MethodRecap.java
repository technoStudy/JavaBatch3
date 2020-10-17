package technoStudy.Day20;

public class _00_MethodRecap {

   // Method types
    public static void voidMethod() {
        System.out.println("Void Method");
    }

    public static void voidWithParameters(int aNumber){
        System.out.println("voidWith a number " + aNumber);
    }

    public static int returnIntWithoutParameters() {
        return 1;
    }

    // Overloading
    public static int returnIntWithParameters(int aNumber) {
        return aNumber + 1;
    }

    // Overloading
    public static double returnIntWithParameters(double aNumber) {
        return aNumber + 1;
    }
}
