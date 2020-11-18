package technoStudy.Day40;

// data consistency rules:
// 1. Username cannot contain space
// 2. Age cannot be less than zero
// 3. Password cannot be less than 6 characters
// 4. etc
public class User {
    private String username;
    private int age; // first step, make private
    private String password;
    // second step, create getter and setter
    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        if(password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if(password.trim().isEmpty()){
            throw new IllegalArgumentException("Password cannot contain only spaces");
        }
        if(countNumbers(password) < 3) {
            throw new IllegalArgumentException("Password must contain at least 3 digits");
        }
        if(countLetters(password) < 3){
            throw new IllegalArgumentException("Password must contain at least 3 letters");
        }
        if(password.length() < 6) {
            throw  new IllegalArgumentException("Password should be at least 6 characters long");
        }
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(!username.contains(" ")) {
            this.username = username;
        } else {
            throw new RuntimeException("The username cannot contain space");
        }
    }


    public static int countLetters(String input) {
        if(input == null){
//            return 0;
            throw new IllegalArgumentException("The input cannot be null");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = Character.toLowerCase(input.charAt(i));
            if(charAt >= 'a' && charAt <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static int countNumbers(String input) {
        if(input == null){
            throw new IllegalArgumentException("The input cannot be null");
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if(charAt >= '0' && charAt <= '9') {
                count++;
            }
        }
        return count;
    }
}
