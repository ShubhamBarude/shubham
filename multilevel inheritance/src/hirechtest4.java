public class hirechtest4 {
   boolean a=false;

    char b='k';
    String c="shubham";
    long d=932518050;
    int e=10;

    public String ak()
    {

        System.out.println("enter a value:"+a);
        return "m";
    }
}
class hirechtest04 extends hirechtest4
{
    public void bk()
    {
        System.out.println("enter a value:"+b);
    }
}
class hirechtest004 extends hirechtest4
{
    public void ck()
    {
        System.out.println(" your name:"+c);
    }
}
class hirechtest0004 extends hirechtest04
{
    public void dk()
    {
        System.out.println(" your mobile no:"+d);
    }
}
class hirechtest00004 extends hirechtest04
{
    public void ek()
    {
        System.out.println("your house number:"+e);
    }
    public static void main(String args[])
    {

        hirechtest00004 obj=new hirechtest00004();
        obj.ek();
        obj.ak();
        obj.bk();
        hirechtest004 obj1=new hirechtest004();
        obj1.ck();
        hirechtest0004 obj2=new hirechtest0004();
        obj2.dk();

    }
}