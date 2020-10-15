package technoStudy.Day19;

public class _02_Method2_Varargs_Task {
    public static void main(String[] args) {
        int multiplication1 = multiplication(1);
        System.out.println(multiplication1);
        int multiplication2 = multiplication(1, 2);
        System.out.println(multiplication2);
        int multiplication3 = multiplication(1, 2, 3);
        System.out.println(multiplication3);
        int multiplication4 = multiplication(1, 2, 3, 4);
        System.out.println(multiplication4);
    }

    public static int multiplication(int... varargs) { // signature of method
        System.out.println("The number of arguments is " + varargs.length);
        int multiplication = 1;
        for (int i = 0; i < varargs.length; i++) {
            multiplication *= varargs[i];
        }
        return multiplication;
    }

}
