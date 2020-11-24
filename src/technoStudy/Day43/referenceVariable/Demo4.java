package technoStudy.Day43.referenceVariable;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();



        shapes.add(rectangle); // each circle is a shape
        shapes.add(circle); // each rectangle is a shape


//        circles.add(rectangle); // not every shape is a circle
        circles.add(circle);

    }
}
