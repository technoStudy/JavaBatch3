package technoStudy.Day43.referenceVariable;

public class Demo3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle = new Square();
//        rectangle = new Object(); // rectagle is child of object
        // not every object is a rectagle
        // but, every rectangle is an object
        Object object = new Rectangle();
    }
}
