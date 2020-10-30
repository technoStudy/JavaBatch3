package technoStudy.Day27;

import java.util.ArrayList;
import java.util.List;

public class _01_ObjectsAndClassesTask1 {
    // Create a class called Cat with 2 properties and 1 method that prints something
    // create 2 objects of this class, set their properties and call their methods

    // create a list of Cats and put your two objects inside that list
    // use enhanced for loop to calculate sum of their age, or any other int property

    // create a static method in _01_ObjectsAndClassesTask1 class to print cat properties
    // public static void print(Cat cat) {

    // create a method in Cat class to print all properties
    // void printProperties() {
    public static void main(String[] args) {
        Cat kitty1 = new Cat();
        Cat kitty2 = new Cat();

        kitty1.color = "White";
        kitty2.color = "Brown";

        kitty1.age = 2;
        kitty2.age = 4;

        kitty1.makeSound();
        kitty2.makeSound();

        List<Cat> list = new ArrayList<>();
        list.add(kitty1);
        list.add(kitty2);

        System.out.println("I have " + list.size() + " cats");

        int sum= 0;
        for (Cat cat : list) {
            sum = sum + cat.age;
        }

        System.out.println("The total sum of their ages is " + sum);
        System.out.println("The cats are " + list);

        print(kitty1);
        kitty2.printProperties();
    }

    public static void print(Cat cat) {
        System.out.println("The " + cat.color +" cat is " + cat.age + " years of age!");
    }
}

class Cat {
    String color;
    int age;
    double weight;

    void makeSound(){
        System.out.println("Cat of color " + color + " is saying Meow!");
    }

    void printProperties() {
        System.out.println("The " + color +" cat is " + age + " years of age!");
    }
}

