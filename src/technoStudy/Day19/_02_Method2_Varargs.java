package technoStudy.Day19;

public class _02_Method2_Varargs {
    public static void main(String[] args) {
        int sum1 = sum(1);
        System.out.println(sum1);
        int sum2 = sum(1, 2);
        System.out.println(sum2);
        int sum3 = sum(1, 2, 3);
        System.out.println(sum3);
        int sum4 = sum(1, 2, 3, 4);
        System.out.println(sum4);
    }

    public static int sum(int... varargs) { // signature of method
        System.out.println("The number of arguments is " + varargs.length);
        int sum = 0;
        for (int i = 0; i < varargs.length; i++) {
            sum += varargs[i];
        }
        return sum;
    }

}
