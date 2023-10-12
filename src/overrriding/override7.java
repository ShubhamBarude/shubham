package overrriding;

public class override7
{
    override7 add()
    {
        System.out.println("enetr a method A");
        override7 obj=new override7();
        return obj;

    }
}
class overloading07 extends override7
{
    @Override
    overloading07 add()
    {
        System.out.println("enetr a method B ");
        overloading07 obj1=new overloading07();
        return obj1;
    }

    public static void main(String[] args) {
        override7 obj3=new  overloading07();
        obj3.add();
    }
}