package technoStudy.Day42.overridingEquals;

import java.util.Objects;

public class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        area = width * length;
        perimeter = 2 * (width + length);
        name = "Rectangle";
    }

    @Override
    public String toString(){
        return name + "\n width: " + width +
                "\n length: " + length +
                "\n area: " + area +
                "\n perimeter: " + perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
