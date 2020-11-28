package technoStudy.Day45.interfaces;

public class Demo {
    public static void main(String[] args) {
        ExampleInterface variable1 = new MultiInheritanceExample();
        variable1.method1();
        variable1.method2();
        AnotherInterface variable2 = new MultiInheritanceExample();
        variable2.method3();
        variable2.method4();
    }
}
