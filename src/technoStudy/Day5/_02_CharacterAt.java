package technoStudy.Day5;

public class _02_CharacterAt {
    public static void main(String[] args) {
        String someVariable = "Hello Techno Study";
        char someChara = someVariable.charAt(0); // indexes start with zero
        System.out.println(someChara);

        String hello = "Hello!";
        System.out.println(hello.charAt(0)); // character at 0 index
        System.out.println(hello.charAt(1)); // character at 1 index
        System.out.println(hello.charAt(2)); // character at 2 index
        System.out.println(hello.charAt(3)); // character at 3 index
        System.out.println(hello.charAt(4)); // character at 4 index
        System.out.println(hello.charAt(5)); // character at 5 index
    }
}
