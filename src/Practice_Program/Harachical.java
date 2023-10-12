package Practice_Program;

public class Harachical
{
    int a=30;
    int b=10;
    void add()
    {
        int result=a+b;
        System.out.println("enter add:"+result);
    }
}
class Harachical1 extends Harachical
{
    void sub()
    {
        int result1=b-a;
        System.out.println("enter sub:"+result1);
    }
}
class Harachical2 extends Harachical
{
    void mul()
    {
        int result2=b*a;
        System.out.println("enter a mul:"+result2);
    }

    public static void main(String[] args) {
        Harachical2 obj=new Harachical2();
        Harachical1 obj1=new Harachical1();
        obj.add();
        obj.mul();
        obj1.sub();
    }
}