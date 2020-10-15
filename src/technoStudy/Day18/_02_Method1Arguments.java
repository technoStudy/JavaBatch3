package technoStudy.Day18;

public class _02_Method1Arguments {

    public static void main(String[] args) {
        sayHello("Techno", 1);
        sayHello("Dake", 2);
        sayHello("Study", 5);
    }

    public static void sayHello(String name, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Hello " + name + "!");
        }
    }
}
