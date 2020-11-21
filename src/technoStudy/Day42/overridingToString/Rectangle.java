package technoStudy.Day42.overridingToString;

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
}
