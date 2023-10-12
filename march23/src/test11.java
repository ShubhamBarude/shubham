public class test11 {
    int a=10;
    double b=0.65;
    public void fg()
    {
        System.out.println("enetr");
    }



    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
public static void main (String args[])
{
    test11 ok=new test11();
    ok.setA(ok.a);
    ok.setB(ok.b);
    System.out.println(ok.getA());
    System.out.println(ok.getB());
}

}
