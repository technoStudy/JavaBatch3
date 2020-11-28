package technoStudy.Day44.task3;

public abstract class Shape {
    private String name;
    abstract double getArea();
    abstract double getPerimeter();

    public String getName() {
        return name;
    }
}
