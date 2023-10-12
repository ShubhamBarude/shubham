interface interftest2
{
    void start();   //public static
    void dis();
}
class interftest02 implements interftest2
{
    @java.lang.Override
    public void start()
    {
        System.out.println("1");
    }

    @java.lang.Override
    public void dis()
    {
     System.out.println("2");
    }

    public static void main(String[] args) {
        interftest02 obj=new interftest02();
        obj.start();
        obj.dis();
    }
}
