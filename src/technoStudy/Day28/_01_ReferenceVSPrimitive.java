package technoStudy.Day28;

public class _01_ReferenceVSPrimitive {
    public static void main(String[] args) {
        int a = 77;
        int b = a;
        System.out.println("b before " + b);
        a = a + 1;
        System.out.println("b after " + b);

        Person person = new Person();
        person.age = 77;
        person.name = "Mark";
        person.surname = "Zack";

        Person anotherPerson = person;
        System.out.println("anotherPerson.age before " + anotherPerson.age);
        person.age = person.age + 1;
        System.out.println("anotherPerson.age after " + anotherPerson.age);
    }
}


