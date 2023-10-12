public class unaryop4 {
    int d=50;
    int v=40;
    public void inc()
    {
        ++d;
        System.out.println("increment"+(+d));
        System.out.println("enter a number:"+(++d));
    }
    public void dec()
    {
        --v;
        System.out.println("decrement"+(+v));
        System.out.println("enter a number:"+(--v));
    }
    public static void main(String args[])
    {
        unaryop4 obj=new unaryop4();
        obj.inc();
        obj.dec();
    }
}
