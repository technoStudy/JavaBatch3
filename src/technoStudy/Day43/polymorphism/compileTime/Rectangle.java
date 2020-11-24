package technoStudy.Day43.polymorphism.compileTime;

public class Rectangle extends Shape {
    String display(){
        return "Rectagle";
    }
    String display(String message){
        return "Rectagle contains message: " + message;
    }
}
