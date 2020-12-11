package technoStudy.Day52.GarbageCollection;

public class GarbageCollection {
    public static void main(String[] args) {
        SimpleClassA o1 = new SimpleClassA();
        o1 = null;
        // o1 becomes eligible for GC
//        System.gc(); // you cannot force GC, you can request it
        // but is not guaranteed to run immediately

        method();
        // o2 becomes eligible for GC
//        System.out.println(o2); // no longer available

        SimpleClassA o3 = new SimpleClassA();
        o3.name = "Techno";
        o3.number = new Integer(7);

        SimpleClassA o4 = new SimpleClassA();
        o4.name = "Study";

        o3 = o4;
        // o3.name becomes eligible for GC
        // o3.number becomes eligible for GC
        System.out.println(o3.name);
        System.out.println(o3.number);


        {
            SimpleClassA o5 = new SimpleClassA();
            SimpleClassB o6 = new SimpleClassB();
            o5.reference = o6;
            o6.reference = o5;
        }  // o5 and o6 become eligible for GC because they are out of scope
//        System.out.println(o5);
//        System.out.println(o6);
    }

    public static void method() {
        Object o2 = new Object();
        System.out.println(o2);
    }
}
