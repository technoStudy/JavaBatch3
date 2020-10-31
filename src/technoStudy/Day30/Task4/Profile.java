package technoStudy.Day30.Task4;

public class Profile {

    String firstName;
    String lastName;
    String address;
    String birthDate;
    String phone;
    String email;
    String nickname;

    public Profile(String firstName, String lastName, String address, String birthDate, String phone, String email, String nickname) {
        this(firstName, lastName, birthDate);
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.address = address;
//        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;
        System.out.println("all args constructor");
    }

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("firstName lastName constructor");

    }

    public Profile(String firstName, String lastName, String birthDate) {
        this(firstName, lastName);
        this.birthDate = birthDate;
        System.out.println("birthDate constructor");
    }

    public Profile(String nickname) {
        this(null, null, null, null, null, null, nickname);
        System.out.println("Nickname constructor");
    }
}
