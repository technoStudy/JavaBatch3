package technoStudy.Day43.task1;

public class Cat extends Animal {
    public Cat() {
        name = "Cat";
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
