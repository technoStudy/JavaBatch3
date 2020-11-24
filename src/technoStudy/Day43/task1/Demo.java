package technoStudy.Day43.task1;


import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Horse());

        for (Animal animal : list){
            animal.makeSound();
            animal.run(10, "miles");
        }
    }

}
