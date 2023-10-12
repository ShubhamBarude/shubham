package overrriding;

public class overriding1
{
    void add(int a,int b)
    {
        System.out.println("enetr a method 1");
    }
    void sub(boolean a,int b)
    {
        System.out.println("enetr a method 2");
    }
}
class overriding01 extends overriding1
{
    @Override
    void add(int a, int b) {
        System.out.println("enetr method 1 overriding");
      //  super.add(a, b);
    }

    @Override
    void sub(boolean a, int b) {
        System.out.println("enter method 2 overriding");
      //  super.sub(a, b);
    }

    public static void main(String[] args) {
        overriding1 ref=new  overriding01();
        ref.add(10,20);
        ref.sub(true,10);
    }
}