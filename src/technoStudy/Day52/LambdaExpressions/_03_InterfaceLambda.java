package technoStudy.Day52.LambdaExpressions;

interface StringFunction {
    String run(String parameter);
}

class StringImpl1 implements StringFunction {
    @Override
    public String run(String parameter) {
        return parameter.concat("!");
    }
}


public class _03_InterfaceLambda {
    public static void main(String[] args) {
       StringFunction f = new StringImpl1();
       print(f);
    }

    public static void print(StringFunction f){
        String variable = f.run("Hello");
        System.out.println(variable);
    }
}

