package technoStudy.Day48.abstraction;

public class Line implements Movable {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public void moveRight() {
        a.moveRight();
        b.moveRight();
    }

    @Override
    public void moveLeft() {
        a.moveLeft();
        b.moveLeft();
    }

    @Override
    public void moveUp() {
        a.moveUp();
        b.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
        b.moveDown();
    }
}
