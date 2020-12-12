package technoStudy.Day53.Generics.GenericMethod;

import technoStudy.Day43.referenceVariable.Circle;
import technoStudy.Day43.referenceVariable.Square;

public class Demo {
    public static void main(String[] args) {
        Object[] array1 = new Object[2];
        array1[0] = new Square();
        array1[1] = new Circle();
        GenericMethodClass.printObjectTypeOfArray(array1);

        Square[] array2 = new Square[2];
        array2[0]  =new Square();
//        array2[1]  =new Circle();
        array2[1]  =new Square();
        GenericMethodClass.printAnyTypeOfArray(array2);
    }
}
