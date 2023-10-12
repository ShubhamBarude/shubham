package statickeyword;

public class Statictest10 {
    Statictest10() {
        System.out.println("constructor 1");
    }

    Statictest10(int a, int b) {
        this();
        System.out.println("constuctor 2");
    }

    static {
        System.out.println("static intilization block:");
    }

    {
        System.out.println("instatnce intilization block:");
    }

    void add() {
        System.out.println("enter a normal method :");
    }

    static {
        System.out.println("static intilization block 2:");
    }

    static int sub() {
        System.out.println("Static method1");
        return 60;
    }
}

class Statictest010 extends Statictest10 {
    Statictest010() {
        super(10, 30);
        System.out.println("constructor 1B");
    }

    static {
        System.out.println("static intilization block 1B:");
    }

    {
        System.out.println("instatnce intilization block 1B:");
    }

    static void show() {
        System.out.println("static method 2");
    }

    public static void main(String[] args) {
        System.out.println("enter a main method");
        Statictest010 obj = new Statictest010();

        obj.add();
        show();
        sub();
    }
}
