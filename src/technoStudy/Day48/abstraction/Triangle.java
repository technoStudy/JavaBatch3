package technoStudy.Day48.abstraction;

public class Triangle implements Movable {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public int getArea() {
        throw new RuntimeException("Not yet implemented");
    }

    @Override
    public void moveRight() {
        a.moveRight();
        b.moveRight();
        c.moveRight();
    }

    @Override
    public void moveLeft() {
        a.moveLeft();
        b.moveLeft();
        c.moveLeft();
    }

    @Override
    public void moveUp() {
        a.moveUp();
        b.moveUp();
        c.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
        b.moveDown();
        c.moveDown();
    }
}
