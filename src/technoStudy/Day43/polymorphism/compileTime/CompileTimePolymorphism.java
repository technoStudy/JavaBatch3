package technoStudy.Day43.polymorphism.compileTime;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.display());
        System.out.println(rectangle.display("Hello!"));
    }
}
