package ExceptionHandling;

public class ThrowsThrow
{
    void ab()
    {
        System.out.println("enter a 1 method");
    }

}
class b{
    void bb()throws NullPointerException
    {
        ThrowsThrow b=null;
        b.ab();
        System.out.println("enter 2 method :");
    }

}
     class c extends ThrowsThrow{

    public static void main(String[] args) {
c obj=new c();
b obj1=new b();
obj1.bb();
//obj.cb();
    }
}