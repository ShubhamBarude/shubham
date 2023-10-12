public class hybtest06
{
    public void ak()
    {
        int a=50;
        int b=20;
        int add=a+b;
        System.out.println("enetr a add:"+add);
    }
}
class hybtest006 extends hybtest06
{
    public int bk(int a,int b)
    {
        int c=a-b;
        System.out.println("enter sub:"+c);
        return 20;
    }
}
class hybtest0006 extends hybtest06
{
    public String kb()
    {
        int a=10;
        int b=20;
        int d=a*b;
        System.out.println("enetr mul:"+d);
        return "cv";
    }
}
class hybtest00006 extends hybtest0006
{
    public int dk()
    {
        byte a=40;
        byte b=20;
        int c= a/b;
        System.out.println("enter div:"+c);
        return 20;
    }
    public static void main(String args[])
    {
        hybtest006 obj=new hybtest006();
        hybtest0006 obj1=new hybtest0006();
        hybtest00006 obj2=new hybtest00006();
        obj.ak();
        obj.bk(40,20);
        obj1.kb();
        obj2.dk();

    }
}
