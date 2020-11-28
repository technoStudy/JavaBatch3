package technoStudy.Day45.task3.animal;

import technoStudy.Day45.task3.interfaces.Flying;

public class Swallow implements Flying {
    @Override
    public void fly() {
        System.out.println("Swallow is flying");
    }

    @Override
    public String food() {
        return "Seeds";
    }
}
