interface  Intertest1
{
    void dis();
    void res();
}
class Intertest2 implements intertest1
{
   public void dis()
    {
        System.out.println("1");
    }
   public void res()
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Intertest2 obj=new Intertest2();
        obj.res();
        obj.dis();
    }
}