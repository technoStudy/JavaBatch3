package technoStudy.Day10;

public class _01_LogicOperators {
    public static void main(String[] args) {
        boolean true1 =  true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        // and
        System.out.println("AND");
        System.out.println( true1 && true2 ); // true, only true when both statements are true
        System.out.println( true1 && false1 ); // false
        System.out.println( false1 && false2 ); // false

        // or
        System.out.println("OR");
        System.out.println( true1 || true2 ); // true
        System.out.println( true1 || false1 ); // true
        System.out.println( false1 || false2 ); // false, only false when both statements are false

        // not
        System.out.println("NOT");
        System.out.println( !true1 ); // false
        System.out.println( !false1 ); // true

    }
}
