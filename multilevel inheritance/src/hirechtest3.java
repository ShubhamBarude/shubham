public class hirechtest3 {
    int a=30;
    short b=10;
    long c=05;
    boolean d=true;
    String e="shubham";
    public int add()
    {
        long e=a+b;
        System.out.println("add"+e);
return 0;
    }
}
class hirechtest03 extends hirechtest3
{
    public void sub()
    {
        long f=a-c;
        System.out.println("sub"+f);
    }
}
class hirechtest003 extends hirechtest3
{
    public void mul()
    {
        long g=a*c;
        System.out.println("mul"+g);
    }
}
class hirechtest0003 extends hirechtest03
{
    public void ak()
    {
        System.out.println("enter a boolean value"+d);

    }
}
class hirechtest00003 extends hirechtest03
{
    public void bk()
    {
        System.out.println("enter a string value"+e);
    }
    public static void main (String args[])
    {
        hirechtest00003 ck=new hirechtest00003();
        ck.bk();
        ck.add();
        ck.sub();
        hirechtest003 dk=new  hirechtest003();
        dk.mul();
        hirechtest0003 ek=new  hirechtest0003();
        ek.ak();
    }
}
