package technoStudy.Day37.throwsException;

public class HandlingException {

    static public void methodThatThrowsException() throws Exception {
        System.out.println("methodThatThrowsException");
    }

    // first way to handle exception, surround with try catch
    static public void method1() {
        try {
            methodThatThrowsException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // second way to handle exception, redeclare or to propagate
    static public void method2() throws Exception {
        methodThatThrowsException();
    }


    public static void main(String[] args) {
        method1();

        try {
            method2();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
