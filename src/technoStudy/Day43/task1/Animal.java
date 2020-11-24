package technoStudy.Day43.task1;

public class Animal {
    void run() {
        System.out.println("Animal running!");
    }
    void run(int meters) {
        System.out.println("Animal running " + meters + " meters!");
    }

    void run(int units, String unit) {
        System.out.println("Animal running " + units + " "+unit+"!");
    }

    void makeSound(){
        System.out.println("Animal making sound!");
    }
}

