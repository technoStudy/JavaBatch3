package technoStudy.Day41.task1.solution;

public class Circle extends Shape {
    double radius;

    public Circle(double radius){
        this.radius = radius;
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        name = "Circle";
    }

    public double getDiameter() {
        return 2 * radius;
    }

}
