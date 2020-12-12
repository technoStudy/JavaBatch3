package technoStudy.Day53.Generics.GenericInterface;

import technoStudy.Day30.Task2.Square;

public class Demo {
    public static void main(String[] args) {
        GenericInterface<String> lambda1 = (s) -> System.out.println(s.toUpperCase());
        GenericInterface<Square> lambda2 = (s) -> System.out.println(s.side);

        GenericInterfaceWithTwoParameters<String, Square> lambda3 = (p1, p2) -> {
            System.out.println(p1.toUpperCase());
            System.out.println(p2.side);
        };
    }
}
