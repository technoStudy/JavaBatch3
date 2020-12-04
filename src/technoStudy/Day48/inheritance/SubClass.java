package technoStudy.Day48.inheritance;

public class SubClass extends SuperClass {
    public SubClass() {
        super(1, 2);
    }

    void method() {
        System.out.println(getA());
        System.out.println(b);
    }

}
