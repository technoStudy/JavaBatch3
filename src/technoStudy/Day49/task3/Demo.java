package technoStudy.Day49.task3;

public class Demo {
    public static void main(String[] args) {
        StringSet set = new StringSetImplementation2();

        set.add("1");
        System.out.println(set);

        set.add("2");
        System.out.println(set);

        set.add("2");
        System.out.println(set);

        set.add("3");
        System.out.println(set);

        set.remove("2");
        System.out.println(set);
    }
}
