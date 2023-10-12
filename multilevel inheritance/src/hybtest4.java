public class hybtest4
{
    float a=2.0f;
    double b=1.5;
    boolean c=false;
    byte d=60;
    short e=20;
    public int add()
    {
        double f=a+b;
        System.out.println("add"+f);
        return 10;
    }
}
class hybtest04 extends hybtest4{
    public float sub( int a,int b)
    {
        double g=a-b;
        System.out.println("sub"+g);
        return 2.36f;
    }
}
class hydtest004 extends hybtest4{
    public double ck()

    {
        System.out.println("enter boolean "+c);
        return 1.65;
    }
}
class hydtest0004 extends hydtest004
{
    public void add1()
    {
        long h=d+e;
        System.out.println("add1"+h);
    }
}
class hydtest00004 extends hydtest0004
{
    public void sub1()
    {
        long i=d-e;
        System.out.println("sub1:" +i+ " ");
    }
    public static void main(String args[])
    {
        hydtest00004 ok=new hydtest00004();
        ok.sub1();
        ok.add();
        ok.ck();
        ok.add1();
        hybtest04 obj=new hybtest04();
        obj.sub(30,20);

    }
}
