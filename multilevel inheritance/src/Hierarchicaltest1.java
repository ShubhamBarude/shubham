public class Hierarchicaltest1
{
    int a=60;
    int b=20;
    public void add()
    {
        int c=a+b;
        System.out.println("add "+c);
    }
}
class  Hierarchicaltest2 extends  Hierarchicaltest1{
    public void sub()
    {
        int d=a-b;
        System.out.println("sub"+d);
    }

}
class Hierarchicaltest3 extends Hierarchicaltest1{
    public void mul()
    {
        int e=a*b;
        System.out.println("mul"+e);
    }
    }
class Hierarchicaltest4 extends Hierarchicaltest2 {
    public void div()
    {
        int f=a/b;
        System.out.println("mul"+f);
    }
}
class Hierarchicaltest5 extends Hierarchicaltest2
{
    public void disp()
    {
        System.out.println("enter a value a"+a);
    }
    public static void main(String args[])
    {
        Hierarchicaltest5 obj=new Hierarchicaltest5();
        obj.add();
        obj.sub();
        obj.disp();
        Hierarchicaltest3 obj1=new Hierarchicaltest3();
        obj1.mul();
        Hierarchicaltest4 obj2=new Hierarchicaltest4();
        obj2.div();


    }
}