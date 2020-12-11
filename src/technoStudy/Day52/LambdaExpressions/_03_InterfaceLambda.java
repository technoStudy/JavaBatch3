package technoStudy.Day52.LambdaExpressions;

import java.util.Random;

interface StringFunction {
    String run(String parameter); // must have only one abstract method
}
public class _03_InterfaceLambda {
    public static void main(String[] args) {
       StringFunction lambda1 = s -> {
           int number = new Random().nextInt();
           return number + " " + s.concat("!");
       };
       print(lambda1);
       print(s -> s.concat("!"));
    }

    public static void print(StringFunction f){
        String variable = f.run("Hello");
        System.out.println(variable);
    }
}

