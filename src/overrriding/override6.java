package overrriding;

public class override6
{
    override6 show()
    {
        System.out.println("enetr a method :");
        override6 obj=new override6();
        return obj;
    }
    override6()
    {
        System.out.println("constructor");
    }
}
class overloading06 extends override6
{
    @Override
    override6 show() {
        System.out.println("enetr method 2");
        overloading06 obj1=new overloading06();
        return obj1;
    }


    public static void main(String[] args) {
        override6 cc=new overloading06();
        cc.show();
    }
}
