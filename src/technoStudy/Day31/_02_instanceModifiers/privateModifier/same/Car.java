package technoStudy.Day31._02_instanceModifiers.privateModifier.same;

public class Car {
    private String name;

    private Car() {
        name = "Ferrari";
    }

    public Car(int year){
        this(); // available within the same class
    }

    private String getName(){
        return name;
    }

    public void printName(){
        System.out.println(getName());
    }
}
