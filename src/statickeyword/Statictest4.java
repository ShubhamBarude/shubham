package statickeyword;

public class Statictest4 {
    int a = 30;
    static int b = 20;
    static int c = 40;

    void mul() {
        Statictest4 obj = new Statictest4();
       int b = 30;
        System.out.println("enter a value mul:" +(obj.b*obj.a));
    }
}
class Statictest04 extends Statictest4 {
    static int c=60;
    void div()
    {
        Statictest04 obj1=new Statictest04();
        System.out.println("enter a values div:"+(obj1.c/obj1.a));

}
    public static void main(String[] args) {
        Statictest4 obj=new Statictest4();
        Statictest04 obj1=new Statictest04();
        obj1.div();
       obj.mul();

    }
}
