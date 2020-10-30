package technoStudy.Day27.pets;

import java.util.List;

public class Bird {
    String name;
    String color;
    List<String> listOfNeeds;
    Owner owner;

    public void printProperties(){
        System.out.println("Name: " + name + ", Color: "+color + ", list of needs: " + listOfNeeds);
        owner.printProperties();
    }

}
