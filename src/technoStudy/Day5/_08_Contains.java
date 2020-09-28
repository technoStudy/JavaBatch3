package technoStudy.Day5;

public class _08_Contains {
    public static void main(String[] args) {
        String someString = "Hello TechnoStudy!";

        System.out.println(someString.contains("H")); // just returns true or false, doest return index
        System.out.println(someString.contains("W"));
        System.out.println(someString.contains("Hello"));

        boolean containsSpace = someString.contains(" ");
    }
}
