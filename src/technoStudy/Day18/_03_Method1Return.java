package technoStudy.Day18;

public class _03_Method1Return {
    public static void main(String[] args) {

        int firstSum = sumOfTwoNumber(1, 2);
        int secondSum = sumOfTwoNumber(4, 5);

        System.out.println(firstSum);
        System.out.println(secondSum);

        // 12
        int finalSum = sumOfTwoNumber(firstSum, secondSum);

        System.out.println("Sum of 4 numbers is " + finalSum);
    }

    public static int sumOfTwoNumber(int number1, int number2) {
        int sum = number1 +  number2;
        return sum;
    }
}
