public class hybtest07 {
    public void ak(String a)
    {

        System.out.println("enter a name:"+a);
    }
}
class hybtest007 extends hybtest07
{
    public int bk(int a,char b,int c)
    {
        int d=a+b;
        System.out.println("enter a add:"+d);
        System.out.println("enter a add:"+b);
        return 10;
    }
}
class hybtest0007 extends hybtest07
{
    public void ck()
    {
        int a=50;
        int b=20;
        int c=b-a;
        System.out.println("enetr sub:"+c);
    }
}
class hybtest00007 extends hybtest007
{
    public int dk()
    {
        short a=30;
        short b=20;
        short c=(short)(a*b);
return 30;
    }
public static void main (String args[])
{
    hybtest007 obj=new hybtest007();
    hybtest0007 obj1=new hybtest0007();
    hybtest00007 obj2=new hybtest00007();
    obj2.dk();
    obj1.ck();
    obj.ak("shubham");
    obj.bk(20,'d',20);

}
}