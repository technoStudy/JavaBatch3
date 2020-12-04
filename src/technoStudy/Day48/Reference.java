package technoStudy.Day48;

import technoStudy.Day28.Person;

public class Reference {
    public static void main(String[] args) {
        int a = 20;
        Person person = new Person();

        System.out.println(a);
        System.out.println(person.age);
        changeValue(a);
        changeValue(person);
        System.out.println(a);
        System.out.println(person.age);
    }

    private static void changeValue(int b) {
        b = b + 1;
    }

    private static void changeValue(Person a) {
        a.age = a.age + 1;
    }

}
