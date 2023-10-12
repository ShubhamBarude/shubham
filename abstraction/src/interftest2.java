interface interftest2
{
    void start();
    void dis();
}
class interftest02 implements interftest2
{
    @java.lang.Override
    public void start()
    {
        System.out.println("enter a name:");
    }

    @java.lang.Override
    public void dis()
    {
        System.out.println("enetr a city:");
    }

    public static void main(String[] args) {
        interftest02 obj=new interftest02();
        obj.start();
        obj.dis();
    }
}
