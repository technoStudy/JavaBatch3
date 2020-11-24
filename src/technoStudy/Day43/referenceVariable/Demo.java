package technoStudy.Day43.referenceVariable;

public class Demo {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle =  square;
        Shape shape = square;
        Object object = square;

        square.getSide();
        square.getWidth();
        square.getName();
//        rectangle.getSide(); //NOT able to access child method
        rectangle.getWidth(); //able to access own method
        rectangle.getName(); //able to access parent method
//        shape.getSide(); //NOT able to access child method
//        shape.getWidth(); //NOT able to access child method
        shape.getName(); //able to access own method
//        object.getSide(); //NOT able to access child method
//        object.getWidth(); //NOT able to access child method
//        object.getName(); //NOT able to access child method

    }
}
