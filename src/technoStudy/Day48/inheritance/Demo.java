package technoStudy.Day48.inheritance;

public class Demo {
    public static void main(String[] args) {
        SubClass o = new SubClass();
        o.method();
        o.getA();
        SuperClass b = o;
//        b.method();
        b.getA();
        Object c = b;
//        c.method();
//        c.getA();
        c.toString();

    }
}
