package technoStudy.Day42.overridingHashcode;


import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        boolean equals = circle1.equals(circle2);
        System.out.println(equals);


        // hashSet is using hashcode to work correctly
        HashSet<Circle> set =  new HashSet<>();
        set.add(circle1);
        set.add(circle2);
        System.out.println(set.size());
    }
}
