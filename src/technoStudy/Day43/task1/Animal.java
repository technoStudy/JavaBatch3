package technoStudy.Day43.task1;

public class Animal {
    String name;

    public Animal() {
        this.name = "Animal";
    }

    void run() {
        System.out.println(name + " running!");
    }
    void run(int meters) {
        System.out.println(name + " running " + meters + " meters!");
    }

    void run(int units, String unit) {
        System.out.println(name + " running " + units + " "+unit+"!");
    }

    void makeSound(){
        System.out.println(name + " making sound!");
    }
}

