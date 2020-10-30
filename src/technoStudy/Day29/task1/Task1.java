package technoStudy.Day29.task1;

public class Task1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println(circle.area());
        System.out.println(circle.circumference());

        // create a second circle, radius should 10
        Circle circle2 = new Circle();
        circle2.radius = 10;
        System.out.println(circle2.area());
        System.out.println(circle2.circumference());

        System.out.println("Area method is called " + Circle.areaCount + " times");
        for (int i = 0; i < 5; i++) {
            circle2.area();
        }
        System.out.println("Area method is called " + Circle.areaCount + " times");

        System.out.println("Circumference method is called " + Circle.circumferenceCount + " times");

        System.out.println("All methods are called " + Circle.allMethodCount + " times");
        System.out.println("All methods are called " + Circle.allMethodCount() + " times");
    }
}
