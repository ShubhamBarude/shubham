public class cons3 {
    cons3()
    {
        System.out.println("enetr a defalt method A");
    }
    cons3(String name)
    {
        this();
        System.out.println("enetr a mothod B");
    }
    cons3 (int a,int b)
    {
        this("shubham");
        System.out.println("enter a method C");
    }
    cons3(boolean a,long b,int c)
    {
        this(20,65);
        System.out.println("enetr a method D");
    }
    cons3(byte n)
    {
        this(false,5562478l,20);
        System.out.println("enetr a method E");
    }
}
class child01 extends cons3
{
    child01()
    {
        super(20,65);
        System.out.println("enetr method 1A");
    }
    child01(String b)
    {
this ();
        System.out.println("enetr  method 1B");
    }
    child01(int a,short b)
    {
        this("latur");
        System.out.println("enetr method 1C");
    }
    child01(boolean a, long b,int c)
    {
        this(20,(short)32);
        System.out.println("enetr method 1D");
    }
    child01(double f)
    {
        this(true,548796325l,65);
        System.out.println("enetr method 1E");
    }

}
class child02 extends child01
{
    child02()
    {
        super(53.02);
        System.out.println("enter method 2A");
    }
    child02(long a)
    {
        this();
        System.out.println("enetr mathod 2B");
    }
    child02(long a,double b)
    {
        this (6446l);
        System.out.println("enetr method 2C");
        }
    child02(String a,short b,char e)
    {
        this(6554845l,69.10);
        System.out.println("enetr method 2D");
    }
    child02 (char n)
    {
        this ("shubham",(short)12,'f');
        System.out.println("enetr method 2E");
    }

    public static void main(String[] args) {
        child02 obj=new child02();
    }
    }
