package technoStudy.Day44.abstracKeyword.example;


public class Car extends Vehicle {
    @Override
    public void move(int distance){
        System.out.println("Car is moving " + distance + " distance");
    }
    public static String getName(){
        return "Car Class";
    }
}
