package statickeyword;

public class Statictest8 {
    Statictest8() {
        System.out.println("this is constructor:");
    }

    static {
        System.out.println(" static intilization block:");
    }

    void ak() {

        System.out.println("normal method:");
    }

    Statictest8 add() {
        Statictest8 obj = new Statictest8();
        System.out.println("enter class method");
        return obj;
    }

    public static void main(String[] args) {
        Statictest8 obj = new Statictest8();
        obj.add();
        obj.ak();

    }
}
