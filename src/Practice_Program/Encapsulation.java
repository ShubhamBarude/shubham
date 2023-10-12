package Practice_Program;

public class Encapsulation
{
    private  int a;
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
        Encapsulation obj=new Encapsulation();
        obj.setA(10);
        obj.setB(20);
        obj.setC(30);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
        System.out.println(obj.getC());
    }
}
