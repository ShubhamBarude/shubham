package encapsulation;

public class encapsulation2
{
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void main(String[] args) {
        encapsulation2 obj=new encapsulation2();
        obj.setA(10);
        obj.setB(20);
        obj.setC(30);
        System.out.println("enter add: "+obj.getA());
        System.out.println(obj.getB());
        System.out.println(obj.getC());
    }

}
