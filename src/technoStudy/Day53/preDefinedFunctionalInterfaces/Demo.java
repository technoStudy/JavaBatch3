package technoStudy.Day53.preDefinedFunctionalInterfaces;

import technoStudy.Day52.LambdaExpressions.*;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
        Consumer<String> l1 = s -> System.out.println(s);
        UnaryOperator<String> l21 = s -> s.concat(s);
        UnaryOperator<String> l22 = s -> {
            return s.concat(s);
        };
        BiConsumer<String, Integer> l3 = (s, i) -> System.out.println(s.toUpperCase() + i.floatValue());
        Runnable l4 = () -> System.out.println();
        Supplier<String> l5 = () -> "Hello";

        l1.accept("S");
        String s = l21.apply("s");
        System.out.println(s);
        l3.accept("b", 2);
        l4.run();
        String s1 = l5.get();
        System.out.println(s1);
    }
}
