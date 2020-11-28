package technoStudy.Day45.interfaces.methodsInsideInterface;

public interface SimpleInterface {
    default void defaultMethod(){
        System.out.println("Default Method");
    }

    static void staticMethod(){
        System.out.println("Static Method");
    }
}
