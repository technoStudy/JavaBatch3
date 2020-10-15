package technoStudy.Day18;

public class _03_Method1Return_Task1 {
    // create a method that takes two numbers and returns their product
    // in main method call this method and the print the results as "the product of two numbers is"
    public static int productOfTwo(int number1, int number2) {
        return number1 * number2;
    }

    public static void main(String[] args) {
        System.out.println("the product of two numbers is " + productOfTwo(3, 4));
    }
}
