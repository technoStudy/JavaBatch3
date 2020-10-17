package technoStudy.Day20;

public class _01_MethodOverloadingTask {
    // create method that's called concat
    // it takes two parameters and returns them concatenated
    // it can accept parameter types: int, char
    // overload all possible parameter data types for the method
    // it returns a String

    public static String concat(int a, int b){
        return Integer.toString(a) + Integer.toString(b);
    }

    public static String concat(char a, char b){
        return Character.toString(a) + Character.toString(b);
    }

    public static String concat(int a, char b){
        return Integer.toString(a) + Character.toString(b);
    }

    public static String concat(char a, int b){
        return Character.toString(a) + Integer.toString(b);
    }

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        char character1 = 'a';
        char character2 = 'b';

        System.out.println(concat(number1, number2));
        System.out.println(concat(character1, character2));
        System.out.println(concat(number1, character1));
        System.out.println(concat(character2, number2));
    }
}
