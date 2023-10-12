public class hybridtest1 {
    int a=60;
    int b=30;
    public String add()
    {
        int c=a+b;
        System.out.println("addition"+c);
        return "shubh";
    }
}
class hybridtest2 extends  hybridtest1
{
    public char sub()
    {
        int d=a-b;
        System.out.println("sub"+d);
        return 'r';
    }
}
class hybridtest3 extends hybridtest1
{
    public double mul()
    {
        int e=a*b;
        System.out.println("mul"+e);
          return 2.33;
    }
}
class hybridtest4 extends hybridtest3{
    public float div()
    {
        int f=a/b;
        System.out.println("div"+f);
        return 10.32f;
    }
    public static void main(String args[])
    {


        hybridtest4 obj=new hybridtest4();
        obj.add();
        obj.mul();
        obj.div();
        hybridtest2 obj1=new hybridtest2();
        obj1.sub();


    }
}