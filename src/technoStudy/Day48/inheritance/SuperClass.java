package technoStudy.Day48.inheritance;

public class SuperClass {
    private int a;
    protected int b;

    public SuperClass() {
        System.out.println("Parent constructed");
    }

    public SuperClass(int a, int b) {
        System.out.println("A Different Parent constructed");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
}
