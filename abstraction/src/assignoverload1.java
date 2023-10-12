public class assignoverload1

{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}

class B extends assignoverload1
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}

 class MainClass
{
    public static void main(String[] args)
    {
        assignoverload1 a = new B();

        a.methodOne();
    }
}

