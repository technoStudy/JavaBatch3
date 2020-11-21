package technoStudy.Day42.task1;

public class Car extends Vehicle {
    @Override
    public void move(int distance){
        System.out.println("Car is moving " + distance + " distance");
    }
    public static String getName(){
        return "Car Class";
    }
}
