package technoStudy.Day20;

public class _02_VarargsRecap {

    public static void varargs(int... array) {}
    public static void varargs(String... array) {
        System.out.println("String... array");
    }
//    below method will be ambiguous
//    public static void varargs(String aString, String... array) {
//        System.out.println("String aString, String... array");
//    }
    public static void varargs(int aNumber, int... array) {}
    public static void varargs(int aNumber, String aString, int... array) {}
    // public static void varargs(int... array, int aNumber) {} // varargs must be the last parameter
    public static void varargs(int aNumber, String aString, String... array) {}

    public static void main(String[] args) {
        varargs("");
    }
}
