package technoStudy.Day41.task1.solution;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.name);
        System.out.println(circle.radius);
        System.out.println(circle.area);
        System.out.println(circle.perimeter);
        System.out.println(circle.getDiameter());
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println(rectangle.name);
        System.out.println(rectangle.length);
        System.out.println(rectangle.width);
        System.out.println(rectangle.area);
        System.out.println(rectangle.perimeter);

        Square square = new Square(5.0);
        System.out.println(square.name);
        System.out.println(square.length);
        System.out.println(square.width);
        System.out.println(square.area);
        System.out.println(square.perimeter);
    }
}
