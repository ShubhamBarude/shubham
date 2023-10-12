public class const2
{
    const2(String name)
    {
        this();
        System.out.println("enter String name method 2");
    }
    const2(int a,short b,long c)
    {
        this("shubham");
        System.out.println("enetr your name method 3");
    }
    const2(boolean a)
    {
        this(20,(short)20,9325180505l);
        System.out.println("enetr boolean value method 4");
    }
    const2()
    {
        System.out.println("enetr default method 1");
    }

}
class child1 extends const2
{
    child1()
    {
        super("shubham");
        System.out.println("enetr default method 11");
    }
    child1(long a,double b,short c)
    {
        this();
        System.out.println("enetr 3 para method 12");
    }
    child1(int z,short y)
    {
        this(2154l,0.32,(short)56);
        System.out.println("enetr 2 para method 13");
    }
    child1(boolean m,String n)
    {
        this (12,(short)54);
        System.out.println("enter 1 para method 14");
    }


}

class child3 extends child1
{
    child3()
    {
        super(56598745l,0.23,(short)32);
        System.out.println("enetr default metod 31");
    }
    child3(String a,int b)
    {
        this ();
        System.out.println("enter two para method 32");
    }
    child3(boolean m,byte x, short s)
    {
        this ("latur",30);
        System.out.println("enetr a three method 33");
    }
    void show()
    {
        System.out.println("normal method");
    }

    public static void main(String[] args) {
        child3 obj=new child3();
       // child1 obj1=new child1();
        obj.show();
    }

}