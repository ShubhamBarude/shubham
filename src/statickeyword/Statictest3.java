package statickeyword;

public class Statictest3 {
    int a = 10;
    int w=10;
    static int b = 20;
    static int c = 30;

    public static void main(String[] args) {
        Statictest3 obj = new Statictest3();
        Statictest3 obj1 = new Statictest3();
        obj.a = 30;
        obj.b = 10;
        obj.c = 40;
        obj1.c = 50;
        obj1.a = 70;
        obj1.b = 90;
        System.out.println("enter a value A:" + obj.a); //30
        System.out.println("enter a values B:" + obj1.a); //70
        System.out.println("enter addition:" + (obj.b + obj1.a)); //80
        System.out.println("enter sub:" + (obj1.c - obj.b)); //40
        System.out.println(Statictest3.b);


    }
}

class Start{

    public static void main(String[] args) {
       Statictest3 obj = new Statictest3();
        System.out.println(Statictest3.b);
        System.out.println(obj.b);
    }
}
