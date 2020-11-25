package technoStudy.Day44.abstracKeyword.example;


public class Car extends Vehicle {
    public Car(){
        super();
    }
//    void finalMethod(){
//
//    }
    @Override
    public void move(int distance){
        System.out.println("Car is moving " + distance + " distance");
    }

    @Override
    public void move(int distance, String units) {

    }

    @Override
    public void fuelUp(int liters) {

    }

    public static String getName(){
        return "Car Class";
    }
}
