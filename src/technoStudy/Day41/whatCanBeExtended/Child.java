package technoStudy.Day41.whatCanBeExtended;

public class Child extends Parent {
    public void instanceMethod() {
        // can access instance and static variables
//        System.out.println(privateVariable);
        System.out.println(defaultVariable);
        System.out.println(protectedVariable);
        System.out.println(publicVariable);
        System.out.println(finalDefaultVariable);
        System.out.println(staticDefaultVariable);
//        System.out.println(finalPrivateVariable  );
        System.out.println(finalPublicVariable);
//        System.out.println(staticPrivateVariable);
        System.out.println(staticPublicVariable);
//        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
        finalPublicMethod();
//        finalPrivateMethod();
        staticPublicMethod();
//        staticPrivateMethod();
    }

    static public void staticMethod() {
        // can only access static variable;
        // cannot access instance variable;

//        System.out.println(privateVariable);
//        System.out.println(defaultVariable);
//        System.out.println(protectedVariable);
//        System.out.println(publicVariable);
//        System.out.println(finalDefaultVariable);
        System.out.println(staticDefaultVariable);
//        System.out.println(finalPrivateVariable);
//        System.out.println(finalPublicVariable);
//        System.out.println(staticPrivateVariable); // not available because it's private
        System.out.println(staticPublicVariable);
        //        privateMethod();
//        defaultMethod();
//        protectedMethod();
//        publicMethod();
//        finalPublicMethod();
//        finalPrivateMethod();
        staticPublicMethod();
//        staticPrivateMethod();
        staticProtectedMethod();
    }

    private void privateMethod(){}
    void defaultMethod(){}
    protected void protectedMethod(){}
    public void publicMethod(){}
//    final public void finalPublicMethod(){}
    final private void finalPrivateMethod(){}
    static public void staticPublicMethod(){
        System.out.println("Child Static Method");
    }
    static private void staticPrivateMethod(){}

}
