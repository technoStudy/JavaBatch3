package technoStudy.Day18;

public class _02_Method1Arguments_Task1 {
    // create a method that takes two numbers and prints out their sum
    public static void main(String[] args) {
        sumOfTwoNumber(1, 2);
    }

    public static void sumOfTwoNumber(int number1, int number2) {
        int sum = number1 +  number2;
        System.out.println("The sum is " + sum);
    }
}
