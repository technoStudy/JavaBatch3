package technoStudy.Day42.overridingHashcode;

import java.util.Objects;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        name = "Circle";
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return name +
                ": radius=" + radius +
                " area=" + area +
                " perimeter=" + perimeter;
    }

    @Override
    public boolean equals(Object anotherCircle){
        try {
            Circle converted = (Circle) anotherCircle;
            return this.radius == converted.radius;
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 17 * (int)radius;
    }
}
