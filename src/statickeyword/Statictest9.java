package statickeyword;

public class Statictest9 {
    static {
        System.out.println("enter sib");
    }

    Statictest9() {
        System.out.println("constructor");
    }

    static void add() {
        System.out.println("static method:");
    }

    {
        System.out.println("instance intilization");
    }

    void sub() {
        System.out.println("normal method:");
    }

    public static void main(String[] args) {
        Statictest9 obj = new Statictest9();
        obj.sub();
        add();
    }
}
