package technoStudy.Day45.task3.animal;

import technoStudy.Day45.task3.interfaces.Flying;
import technoStudy.Day45.task3.interfaces.Sailing;

public class Duck implements Flying, Sailing {
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void sail() {
        System.out.println("Duck sailing");
    }

    @Override
    public String food() {
        return "Duck food";
    }
}
