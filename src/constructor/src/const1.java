public class const1
{
    const1()
    {
        System.out.println("enetr a default con1");
    }
    const1(String name)
    {
        this();
        System.out.println("enetr a parametric cons1");
    }
    const1(int id)
    {
        this ("shubham");
        System.out.println("enetr a int parametric con1");
    }
    const1(boolean a)
    {
        this(20);
        System.out.println("enetr a condi1");
    }
    const1(byte b)
    {
        this(true);
        System.out.println("enetr a byte ");
    }
    const1(int k,short d,float v)
    {
        this ((byte)30);
        System.out.println("enetr 3 para");
    }
}
class child extends const1
{
    child()
    {
        super(20,(short)10,0.2f);
        System.out.println("child  parent default");
    }
    child (short z)
    {
        this();
        System.out.println("enetr default cons2");
    }
    child (long y)
    {
        this ((short)20);
        System.out.println("enetr short value ");
    }
    child (double d)
    {
        this(9325180505l);
        System.out.println("enetr a mobile number");
    }
}
class child2 extends child
{
    child2 ()
    {
        super(0.23);
        System.out.println("enetr child2 parent default");
    }
    child2(int age)
    {
        this();
        System.out.println("enetr a method no 2");
    }
    child2(String city)
    {
        this(20);
        System.out.println("enetr a child 2 age ");
    }
    child2(short m)
    {
        this("latur");
        System.out.println("enetr a child city");
    }
    void show()
    {
        System.out.println("enetr a normal method");
    }

    public static void main(String[] args) {
        child obj=new child();
        child2 obj1=new child2();
        obj1.show();
    }
}