public class optest1 {
    byte a=60;
    byte b=20;
    int c=50;
    short m=30;
    short n=10;
    public void add()
    {
        byte d=(byte)((byte)a+b);
        System.out.println("add:"+d);
    }
    public void sub()
    {
        short e=(short)((short)m-n);
        System.out.println("sub"+e);
    }
    public void mul()
    {
        int f=a*b;
        System.out.println("mul:"+f);
    }
    public void div ()
    {
        int g=a/b;
        System.out.println("div:"+g);
    }
    public void rem()
    {
        int h=c%b;
        System.out.println("rem:"+h);
    }
    public static void main(String args[])
    {
        optest1 obj=new optest1();
        obj.add();
        obj.sub();
        obj.mul();
       obj.div();
        obj.rem();
    }
}
