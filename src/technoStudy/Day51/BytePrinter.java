package technoStudy.Day51;

public class BytePrinter {
    public void print(byte b) {
        System.out.print("byte");
    }

    public void print(Byte b) {
        System.out.print("Byte");
    }

    public void print(int i) {
        System.out.print("int");
    }

    public void print(long i) {
        System.out.print("long");
    }

    public static void main(String[] args) {
        BytePrinter printer = new BytePrinter();
        short x = 10;
        byte y = 12;
        printer.print(x);
        printer.print(y);

    }
}