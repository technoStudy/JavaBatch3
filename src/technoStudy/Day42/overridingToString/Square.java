package technoStudy.Day42.overridingToString;

public class Square extends Rectangle {
    public Square(double side){
        super(side, side);
        name = "Square: special kind of Rectangle";
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
