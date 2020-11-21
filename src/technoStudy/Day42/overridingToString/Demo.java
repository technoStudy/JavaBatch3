package technoStudy.Day42.overridingToString;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println(rectangle);
        Square square = new Square(5.0);
        System.out.println(square);
    }
}
