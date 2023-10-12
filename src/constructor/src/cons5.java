public class cons5
{
    cons5()
    {

        System.out.println("enter a method 1A");
    }
    cons5(String m)
    {
        this();
        System.out.println("enetr a method 2A");
    }
    cons5(int a,int b)
    {
        this ("shubham");
        System.out.println("enetr a method 3A");
    }
    cons5(boolean a,short b,byte c)
    {
        this(20,15);
        System.out.println("enter a method 4A");
    }
    cons5(String a,char b,long c)
    {
        this(true,(short)25,(byte)14);
        System.out.println("enetr a method 5A");
    }
}
class cons05 extends cons5
{
    cons05()
    {
        super("djhy",'d',58485463564556l);
        System.out.println("enetr a method 1B");
    }
    cons05(float a,double b,long c)
    {
        this();
        System.out.println("enetr a method 2B");
    }
    cons05(short a,int b,boolean c)
    {
        this(2.03f,6.23,948462454l);
        System.out.println("eneter a method 3B");
    }
    cons05(byte a)
    {
        this((short)10,20,false);
        System.out.println("enetr a method 4B");
    }
}
class cons005 extends cons05
{
    cons005()
    {
    super((byte)14);
        System.out.println("enter a method 1C");
    }
    cons005(double n,float b,short m)
    {
        this ();
        System.out.println("enetr a method 2C");
    }

    public static void main(String[] args) {
        cons005 obj=new cons005();

    }

}
