package technoStudy.Day43.task1;

public class Horse extends Animal {
    public Horse() {
        name = "Horse";
    }

    @Override
    void makeSound() {
        System.out.println("Neigh!");
    }
}
