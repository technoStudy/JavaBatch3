package technoStudy.Day37.task3;

public class Task3Solution {
    public static void main(String[] args) {
        System.out.println(getTheFirstLetter(null));
        System.out.println(getTheFirstLetter(""));
        System.out.println(getTheFirstLetter("0"));
    }

    public static Character getTheFirstLetter(String input) {
        try {
            return input.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("The input was null");
            return '0';
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The input was empty");
            return '0';
        }
    }
}
