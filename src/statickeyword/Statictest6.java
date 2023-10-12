package statickeyword;

public class Statictest6 {
    int a = 10;
    static int b = 20;
    static int c = 40;

    void sub() {
        System.out.println("enter a values instance block:" + (b - a));
    }

    static {

        System.out.println("enter a values static block:" + (c + b));
    }

    Statictest6() {
        System.out.println("enter a values constuctor:" + (a + b));
    }

    public static void main(String[] args) {
        Statictest6 obj = new Statictest6();
        int a = 40;
        System.out.println("enter a vlues main method:" + (c / b));
        obj.sub();
    }
}
