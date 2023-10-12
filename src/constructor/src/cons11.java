public class cons11
{
    cons11()
    {
        System.out.println("enetr method 1");
    }
    cons11(String a,int b)
    {
        System.out.println("enetr method 2");
    }
}
class cons011 extends cons11
{
    cons011()
    {
        System.out.println("enetr method 1A");
    }
    cons011(int a,boolean b)
    {
        System.out.println("enetr method 1B");
    }

    public static void main(String[] args) {
        cons011 obj=new cons011();
        cons011 obj1=new cons011(10,true);

    }
}