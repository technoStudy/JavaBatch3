package technoStudy.Day50;

public class StaticBlocks {

}
class Deer {
    static int count;
    static { count = 1; }

    Deer() {
        count++;
    }

    public static void main(String[] args) {
        count++;
        Deer mother = new Deer();
        Deer father = new Deer();
        Deer fawn = new Deer();
        System.out.println(Deer.count);
    }
}