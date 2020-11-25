package technoStudy.Day44.abstracKeyword.example;


import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Car());
        list.add(new Car());
        list.add(new Truck());
        list.add(new Truck());
        list.add(new Car());
//        list.add(new Vehicle());
    }
}
