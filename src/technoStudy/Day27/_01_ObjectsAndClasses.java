package technoStudy.Day27;

public class _01_ObjectsAndClasses {
    public static void main(String[] args) {

        Dog lucy = new Dog();
        lucy.breed = "Neapolitan Mastiff";
        lucy.color = "Black";
        lucy.age = 5;
        lucy.size = "Large";

        System.out.println("Lucy's breed is " + lucy.breed);
        lucy.sleep();

        Dog max = new Dog();
        max.breed = "Maltese";
        max.color = "White";
        max.size = "small";

        System.out.println("Max's breed is " + max.breed);
        max.sleep();
    }
}

class Dog {
    String breed;
    String color;
    int age;
    String size;

    void sleep(){
        System.out.println(breed +  " is sleeping");
    }
}
