package technoStudy.Day47.coffeeMachine;

public class BrewingUnit {
    public void brew() {
        System.out.println("Brew");
        pourWater();
        heatUp();
        checkTemprature();
    }

    public void checkStatus(){
        System.out.println("checkStatus");
    }

    public void changeHeatingUnit(){
        System.out.println("changeHeatingUnit");

    }

    private void heatUp(){}
    private void checkTemprature(){}
    private void pourWater(){}
}
