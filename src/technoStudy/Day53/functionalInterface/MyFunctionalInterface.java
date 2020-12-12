package technoStudy.Day53.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void run(String p1); // abstract method
    default void run2(String p1){
        System.out.println(p1);
    }
//    void run4(); // cannot have two abstract methods
    static void run3(String p1) {
        System.out.println(p1);
    }
}
