package technoStudy.Day5;

public class _09_Equals_and_EqualsIgnoreCase {
    public static void main(String[] args) {
        String someString = "TechnoStudy";
        String anotherString = "TechnoStudy";
        String lowerCaseString = "technostudy";

        System.out.println(someString.equals(anotherString));
        System.out.println(someString.equals(lowerCaseString)); // considering the case, they are not equal

        System.out.println(someString.equalsIgnoreCase(anotherString));
        System.out.println(someString.equalsIgnoreCase(lowerCaseString)); // not considering the case, they are equal

    }
}
