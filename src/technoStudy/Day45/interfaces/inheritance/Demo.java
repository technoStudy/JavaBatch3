package technoStudy.Day45.interfaces.inheritance;

public class Demo {
    public static void main(String[] args) {
        ExampleClass object = new ExampleClass();
        ChildInterface childReference = object;
        ParentInterface parentInterface = object;
        AnotherParentInterface anotherParentInterface = object;
    }
}
