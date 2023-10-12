package Practice_Program;

public class Constructor
{
    Constructor()
    {
        System.out.println("it is default con 1: ");
    }
    Constructor(int a,int b)
    {
        this();
        System.out.println("it is parametric con 2:");
    }
    Constructor(int a ,int b,int c)
    {
        this(30,20);
        System.out.println("it is parametric con 3");
    }
    Constructor(String a,int b)
    {
        this(20,30,45);
        System.out.println("it is parametric con 4");
    }
}
class Constructor1 extends Constructor
{
    Constructor1()
    {
        super("name",20);
        System.out.println("default con 2================super:");
    }
    Constructor1(int a, int b,int c)
    {
        this();
        System.out.println("it is second parametric con1A:");
    }
    Constructor1(int a ,int b)
    {
        this(56,54,47);
        System.out.println("it is second parametric con 2A:");
    }
    Constructor1(int a)
    {
        this (14,13);
        System.out.println("enter a second parametric con 3A:");
    }

    public static void main(String[] args) {
        Constructor1 obj=new Constructor1();
        Constructor1 obj1=new Constructor1(30);
    }
}