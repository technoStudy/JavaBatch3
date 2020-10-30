package technoStudy.Day27.pets;

import java.util.ArrayList;
import java.util.List;

public class MainPetClass {
    public static void main(String[] args) {
        Bird eagle = new Bird();
        eagle.name = "Khabib";
        eagle.color = "Brown";
        eagle.listOfNeeds = new ArrayList<>();
        eagle.listOfNeeds.add("cage");
        eagle.listOfNeeds.add("food");
        eagle.listOfNeeds.add("water");
        eagle.listOfNeeds.add("cleaning");

        eagle.owner = new Owner();
        eagle.owner.name = "Dake";

        Fish fish = new Fish();
        fish.name = "Nemo";
        fish.color = "blue";

        fish.listOfNeeds = generateListOfNeedsForAFish();

        Owner fishOwner = new Owner();
        fishOwner.name = "Techno";

        fish.owner = fishOwner;

        eagle.printProperties();
        System.out.println();
        fish.printProperties();
    }

    public static List<String> generateListOfNeedsForAFish(){
        List<String> listOfNeedOfAFish = new ArrayList<>();
        listOfNeedOfAFish.add("water");
        listOfNeedOfAFish.add("food");
        listOfNeedOfAFish.add("cleaning");

        return listOfNeedOfAFish;
    }
}
