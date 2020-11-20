package technoStudy.Day41.whatCanBeExtended;

public class Parent {
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable;
    public int publicVariable;
    final int finalDefaultVariable = 10;
    static int staticDefaultVariable;
    final private int finalPrivateVariable = 10;
    static private int staticPrivateVariable;
    final public int finalPublicVariable = 10;
    static public int staticPublicVariable;

    private void privateMethod(){}
    void defaultMethod(){}
    protected void protectedMethod(){}
    public void publicMethod(){}
    final public void finalPublicMethod(){}
    final private void finalPrivateMethod(){}
    static public void staticPublicMethod(){
        System.out.println("Parent Static Method");
    }
    static private void staticPrivateMethod(){}
    static protected void staticProtectedMethod(){}
}
