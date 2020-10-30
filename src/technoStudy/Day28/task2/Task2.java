package technoStudy.Day28.task2;

public class Task2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("r1.perimeter " + r1.perimeter());

        Rectangle r2 = new Rectangle();
        r2.length = 2;
        System.out.println("r2.perimeter " + r2.perimeter());

        Rectangle r3 = new Rectangle();
        r3.length = 2;
        r3.width = 3;
        System.out.println("r3.perimeter " + r3.perimeter());
    }
}
