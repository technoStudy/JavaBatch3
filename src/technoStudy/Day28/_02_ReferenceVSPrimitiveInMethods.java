package technoStudy.Day28;

public class _02_ReferenceVSPrimitiveInMethods {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("a before " + a);
        change(a);
        System.out.println("a after " + a);


        Person person = new Person();
        System.out.println("person.age before " + person.age);  //0
        changePersonAge(person);
        System.out.println("person.age after " + person.age); //1
    }

    public static void change(int parameter){
        parameter = parameter + 1;
    }

    public static void change(Person parameter){
        parameter.age = parameter.age + 1;
    }

    public static void changePersonAge(Person param) {
        param.age++;
    }
}


