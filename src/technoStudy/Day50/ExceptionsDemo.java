package technoStudy.Day50;

import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        Kangaroo k = new Joey();
        try {
            k.hop();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

class Kangaroo {
    public void hop() throws Exception { }
    public void jump(){}
}
class Joey extends Kangaroo {
    public void hop() throws IOException { }
//    public void jump() throws IOException {} // cannot declare because parent does not declare
}
