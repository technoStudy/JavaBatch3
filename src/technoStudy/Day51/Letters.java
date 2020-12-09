package technoStudy.Day51;

public class Letters {
    {
        System.out.print("1");
    }
    static {
        System.out.println("static block initializer 1");
    }

    public Letters() {
        {{ System.out.print("4"); }}
    }

    {
        System.out.print("2");
    }

    public static void main(String[] args) {
        Letters a = new Letters();
        {
            System.out.print("5");
        }

        System.out.println();
        Letters b = new Letters();

    }

    public  void anotherMethod() {
        {
            System.out.print("6");
        }
    }
    {
        System.out.print("3");
    }

    static {
        System.out.println("static block initializer 2");
    }
}
