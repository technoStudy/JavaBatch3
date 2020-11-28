package technoStudy.Day45.task3.animal;

import technoStudy.Day45.task3.interfaces.Sailing;

public class Shark implements Sailing {
    @Override
    public void sail() {
        System.out.println("Shark sailing");
    }

    @Override
    public String food() {
        return "Meat";
    }
}
