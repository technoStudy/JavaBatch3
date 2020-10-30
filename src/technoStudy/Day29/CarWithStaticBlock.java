package technoStudy.Day29;

public class CarWithStaticBlock {
    public String name;
    public static int total;

    static {
        System.out.println("Static block executing");
        total = 10;
//        name = "Techno Study"; // cannot access instance variable
    }

    static {
        System.out.println("Second static block executing");
    }
}
