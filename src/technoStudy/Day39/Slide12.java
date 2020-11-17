package technoStudy.Day39;

public class Slide12 {
    int instanceVariable = 1;

    public static void main(String[] args) {
        Slide12 instance = new Slide12();
        instance.method();
        System.out.println(instance.instanceVariable)
//        localVar;
        if(true) {
            int anotherLocalVariable = 1;
            System.out.println(instance.instanceVariable)

        }

        int localVar = instance.returnLocalVar();
//        anotherLocalVariable;
    }

    public void method() {
        int localVar = 1;
        System.out.println(instanceVariable);
    }

    public int returnLocalVar(){
        int localVar = 1;
        return localVar;
    }
}
