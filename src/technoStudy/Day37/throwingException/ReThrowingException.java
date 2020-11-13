package technoStudy.Day37.throwingException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrowingException {
    public static void main(String[] args) {
        try {
            try {
                FileInputStream stream = new FileInputStream("File.txt");
            } catch (Exception exception) {
                System.out.println("File not found");
                throw exception;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
