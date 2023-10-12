public class optest2
{

    int a=20;
    int b=30;
    int c=40;
    public void add()
    {
        int  res=(a+=5);
        System.out.println("add"+res);
    }
    public void sub()
    {
        int e=b-a;
        System.out.println("sub"+e);
    }
    public int mul()
    {
        int f=a*c;
        System.out.println("mul"+f);
        return 10;
    }
    public String div()
    {
        int g=c/a;
        return "mjg";
    }
    public char rem()
    {
        int h=b%a;
        System.out.println("rem"+h);
        return 'm';
    }
    public static void main(String args[])
    {
        optest2 obj=new optest2();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.rem();
    }
}
