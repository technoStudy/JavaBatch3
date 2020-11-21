package technoStudy.Day42.overridingEquals;

public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        boolean equals = circle1.equals(circle2);
        System.out.println(equals);

        Rectangle rectangle = new Rectangle(5.0, 2.0);
        boolean equals1 = circle1.equals(rectangle);
        System.out.println(equals1);

        boolean equals2 = circle1.equals(null);
        System.out.println(equals2);

        Square square1 = new Square(5.0);
        Square square2 = new Square(5.0);
        System.out.println("square equal : " + square1.equals(square2));


        Rectangle rectangle2 = new Rectangle(5.0, 2.0);
        System.out.println("rectangle equal : " +rectangle.equals(rectangle2));
    }
}
