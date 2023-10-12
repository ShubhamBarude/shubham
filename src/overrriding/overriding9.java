package overrriding;

public class overriding9
{
    overriding9 ak()
    {
        System.out.println("enter add:");
        overriding9 obj=new overriding9();
        return obj;
    }
    overriding9 bk()
    {
        System.out.println("enter sub:");
        overriding9 obj1=new overriding9();
        return obj1;
    }
}
class overloading09 extends overriding9
{
    @Override
    overloading09 ak() {
        System.out.println("enetr addition:");
        overloading09 ref=new overloading09();
        return ref;
    }

    @Override
    overloading09 bk() {
        System.out.println("enter substraction:");
        overloading09 ref1=new overloading09();
        return ref1;
    }

    public static void main(String[] args) {
        overriding9 cc=new overloading09();
        cc.ak();
        cc.bk();
    }
}
