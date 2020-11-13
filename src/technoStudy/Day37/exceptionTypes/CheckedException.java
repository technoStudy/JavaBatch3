package technoStudy.Day37.exceptionTypes;

import java.io.FileInputStream;

public class CheckedException {
    public static void main(String[] args) {
        FileInputStream stream = null;

        try {
            stream = new FileInputStream("someFile.txt");
        } catch (Exception e){
            System.out.println("Cannot open file!");
        }

    }
}
