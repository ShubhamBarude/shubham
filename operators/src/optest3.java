public class optest3
{
    int a=10;
    int b=20;
    int c=30;
    int d=40;
    public void add()
    {
        int e=a+b+c+d;
        System.out.println("add:"+e);
    }
    public void sub()
    {
        int f=a+b+c-d;
        System.out.println("sub:"+f);
    }
    public void mul()
    {
        int g=a*b-c;
        System.out.println("mul:"+g);
    }
    public void div()
    {
        int h=d/b;
        System.out.println("div:"+h);
    }
    public void rem()
    {
        int i=c%b;
        System.out.println("rem:"+i);
    }
    public static void main(String args[])
    {
        optest3 obj1=new optest3();
        obj1.add();
        obj1.sub();
        obj1.mul();
        obj1.div();
        obj1.rem();

    }
}
