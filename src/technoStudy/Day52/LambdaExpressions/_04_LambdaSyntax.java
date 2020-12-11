package technoStudy.Day52.LambdaExpressions;

interface VoidLambdaNoParameter {
    void run();
}

interface VoidLambdaSingleParameter {
    void run(String parameter);
}

interface VoidLambdaBiParameter {
    void run(String parameter1, int parameter2);
}

interface ReturnLambdaSingleParameter {
    String run(String parameter);
}

interface ReturnLambdaNoParameter {
    String run();
}


public class _04_LambdaSyntax {
    public static void main(String[] args) {
        VoidLambdaSingleParameter l1 = s -> System.out.println(s);
        ReturnLambdaSingleParameter l21 = s -> s.concat(s);
        ReturnLambdaSingleParameter l22 = s -> { return s.concat(s);};
        VoidLambdaBiParameter l3 = (s, i) ->System.out.println(s + i);
        VoidLambdaNoParameter l4 = () -> System.out.println();
        ReturnLambdaNoParameter l5 = () -> "Hello";
    }
}
