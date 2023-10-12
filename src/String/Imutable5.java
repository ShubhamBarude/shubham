package String;

public class Imutable5
{
    public static void main(String[] args) {
        Imutable05 obj=new Imutable05(60,20);
        obj.getA();
        obj.getB();
    }
}
final class Imutable05
{
    private final int a;
    private final int b;
    Imutable05(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("enter a consructor"+(a-b));
    }

    public int getA() {
        System.out.println("getter method a "+a);
        return a;
    }

    public int getB() {
        System.out.println("getter method b"+b);
        return b;
    }

}
