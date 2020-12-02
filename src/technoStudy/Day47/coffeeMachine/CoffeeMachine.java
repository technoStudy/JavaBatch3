package technoStudy.Day47.coffeeMachine;

public class CoffeeMachine {
    private BrewingUnit brewingUnit;
    private CoffeeStorageUnit coffeeStorageUnit;
    private CupDispenser cupDispenser;
    private Grinder grinder;

    public CoffeeMachine() {
        brewingUnit = new BrewingUnit();
        coffeeStorageUnit = new CoffeeStorageUnit();
        cupDispenser = new CupDispenser();
        grinder = new Grinder();
    }

    public void switchOn() {
        brewingUnit.checkStatus();
        coffeeStorageUnit.checkStatus();
        cupDispenser.checkStatus();
        grinder.checkStatus();
    }

    public void selectCoffee(){
        System.out.println("Selecting Coffee");
        coffeeStorageUnit.dispenseCoffeeBeans();
        grinder.grind();
        brewingUnit.brew();
        cupDispenser.dispenseCup();
    }

    public void refill() {
        coffeeStorageUnit.refill();
        grinder.changeBlades();
        brewingUnit.changeHeatingUnit();
        cupDispenser.refill();
    }
}
