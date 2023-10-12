package Practice_Program;

public class Upcasting
{
    int a=20;
    int b=30;
    void add()
    {
        System.out.println("enter add:"+(a+b));
    }
}
class Upcasting1 extends Upcasting
{

    void add() {
        System.out.println("enter mul2:"+(a*b));
       super.add();

    }

    void sub()
    {
        System.out.println("enter sub:"+(b-a));
    }

    public static void main(String[] args) {
        Upcasting ref = new Upcasting1();
        ref.add();
    }
}