package technoStudy.Day4;

import technoStudy.Day4.referenceDataType.CircleClass;

public class TestingReferenceType {
    public static void main(String[] args) {
        CircleClass circle = new CircleClass();
        circle.radius = 10;

        System.out.println("Radius: " + circle.radius);
        System.out.println("X coord: " + circle.x);
        System.out.println("Y coord: " + circle.y);
    }
}
