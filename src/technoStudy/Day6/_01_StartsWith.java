package technoStudy.Day6;

public class _01_StartsWith {
    public static void main(String[] args) {
        String someString = "Hello world!";
        boolean startsWithHello =someString.startsWith("Hello"); // is case sensitive
        System.out.println(startsWithHello);

        boolean startsWithL = someString.startsWith("world", 6); // offset specifies how many characters to skip and to start looking
        System.out.println(startsWithL);
    }
}
