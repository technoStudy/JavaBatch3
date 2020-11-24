package technoStudy.Day43.task1;

public class Dog extends Animal {
    public Dog() {
        name = "Dog";
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
