package technoStudy.Day43.referenceVariable;

import java.util.ArrayList;

public class DowncastingDemo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        shapes.add(rectangle); // each circle is a shape
        shapes.add(circle); // each rectangle is a shape

        for(Shape shape : shapes) {
//            Rectangle rectangle1 = shape; // not every shape is a rectangle
            try {
                Rectangle rectangle1 = (Rectangle) shape; // I am pretty sure it's a rectangle
                System.out.println(rectangle1.getWidth());
            } catch (ClassCastException e) {
                System.out.println("I guess I was wrong, it's not a rectangle");
            }
        }
    }
}
