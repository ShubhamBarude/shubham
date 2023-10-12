package String;

public class Imutable4
{
    public static void main(String[] args) {
        Imutable04 obj=new Imutable04(20,30);
        obj.getA();
        obj.getB();

    }
}
final class Imutable04
{
    private final int a;
    private final int b;
    Imutable04(int a,int b)
    {
        this.a=10;
        this.b=20;
        System.out.println("enter a add:"+(a+b));
    }

    public int getA() {
        System.out.println("enter getter method a:");
        return a;
    }

    public int getB() {
        System.out.println("enter getter method b:");
        return b;
    }

}