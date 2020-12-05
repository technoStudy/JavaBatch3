package technoStudy.Day49.task2;

public class Demo {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3,3);
        Matrix m2 = new Matrix(3,3);
        m1.fillWithRandomValues(-10, 10);
        m2.fillWithRandomValues(-10, 10);
        System.out.println(m1);
        System.out.println("+");
        System.out.println(m2);
        System.out.println("=");
        Matrix result = m1.plus(m2);
        System.out.println(result);

        Matrix product = m1.multiply(m2);
    }
}
