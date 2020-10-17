package technoStudy.Day20;

public class _02_VarargsRecapTask {
    // create concat method with varargs
    // for int and char
    // return type should be String
    public static String concat(int... list){
        String result = "";
        for (int i = 0; i < list.length; i++) {
            result += Integer.toString(list[i]);
        }
        return result;
    }

    public static String concat(char... list){
        String result =  "";
        for (int i = 0; i < list.length; i++) {
            result += Character.toString(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        char character1 = 'a';
        char character2 = 'b';

        System.out.println(concat(number1));
        System.out.println(concat(number1, number2));
        System.out.println(concat(number1, number2, number2, number1));
        System.out.println(concat(character1));
        System.out.println(concat(character1, character2));
        System.out.println(concat(character1, character2, character2, character1));
        //System.out.println(concat(number1, character2)); // here charater2 will be converted to int first

    }
}
