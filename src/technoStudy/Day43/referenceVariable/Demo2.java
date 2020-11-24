package technoStudy.Day43.referenceVariable;

public class Demo2 {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle =  square;
        Shape shape = square;
        Object object = square;

        square.var = 0;
        rectangle.var = 20;

        System.out.println(square.var);
        System.out.println(rectangle.var);

    }
}
