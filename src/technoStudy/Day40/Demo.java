package technoStudy.Day40;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Techno Study");
//        user.age = -10;
        user.setAge(10);
//        System.out.println(user.age);
        System.out.println(user.getAge());
    }
}
