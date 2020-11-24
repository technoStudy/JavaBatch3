package technoStudy.Day43.polymorphism.runTime;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = getShapes();

        for (Shape shape : shapes) {
            System.out.println(shape.display());
        }
    }

    private static ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomShape = random.nextInt(3);
            switch (randomShape) {
                case 0:
                    shapes.add(new Shape());
                    break;
                case 1:
                    shapes.add(new Rectangle());
                    break;
                case 2:
                    shapes.add(new Circle());
                    break;
            }
        }
        return shapes;
    }
}
