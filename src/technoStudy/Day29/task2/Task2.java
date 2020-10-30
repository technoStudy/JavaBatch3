package technoStudy.Day29.task2;

public class Task2 {
    public static void main(String[] args) {
        int result = Calculus.sum(1, 2);
        System.out.println(result);

        System.out.println(Calculus.subtract(1,2));
        System.out.println(Calculus.multiply(1,2));
        double divide = Calculus.divide(1, 2);
        System.out.println(divide);

        double result2 = Calculus.divide(1, 0);
        System.out.println(result2);
    }
}
