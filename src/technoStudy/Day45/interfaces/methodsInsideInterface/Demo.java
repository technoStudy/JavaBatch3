package technoStudy.Day45.interfaces.methodsInsideInterface;

public class Demo {
    public static void main(String[] args) {
        SimpleClass object = new SimpleClass();
        object.defaultMethod();
        // static method not inherited from interface
        SimpleInterface.staticMethod();
    }
}
