package technoStudy.Day45.interfaces.multipleInheritance;

public class ExampleClass implements InterfaceWithVariable, AnotherInterfaceWithVariable{
    public int method() {
        System.out.println(variable1);
        System.out.println(InterfaceWithVariable.PI);
        return 0;
    }
}
