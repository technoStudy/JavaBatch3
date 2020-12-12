package technoStudy.Day53.Generics.GenericClass;

import technoStudy.Day30.Task2.Square;

public class Demo {
    public static void main(String[] args) {
        StringHolder h1 = new StringHolder();
        h1.setStore("String");
        GenericHolder<String> h2 = new GenericHolder<>();
        h2.setStorage("String");

        GenericHolder<Square> h3 = new GenericHolder<>();
        h3.setStorage(new Square(2));
    }
}
