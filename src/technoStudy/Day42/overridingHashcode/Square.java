package technoStudy.Day42.overridingHashcode;

public class Square extends Rectangle {
    public Square(double side) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Square) {
            return this.length == ((Square) o).length;
        } else {
            return false;
        }
    }
}
