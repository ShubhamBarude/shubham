package String;

public class Imutable6 {
    public static void main(String[] args) {
        Imutable06 obj=new Imutable06(60,20);
        obj.getA();
        obj.getB();
    }
}
final class Imutable06
{
    private final int a;
    private final int b;
    Imutable06(int a, int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("enter  a add:"+(a+b));
    }

    public int getA() {
        System.out.println("enter getter method a:"+(b-a));
        return a;
    }

    public int getB() {
        System.out.println("enter getter method b"+(b/a));
        return b;
    }
}
