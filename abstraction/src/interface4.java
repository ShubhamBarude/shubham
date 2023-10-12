interface interface4
{
    void ak();
    int a=40;

}
interface interface04
{
    void bk();
    int b=20;
}
class interface40 implements interface4,interface04
{
    @Override
    public void ak()
    {
        int c=a*b;
        System.out.println("enetr mul:"+c);
    }
    public void bk()
    {
        int d=a/b;
        System.out.println("enetr a div:"+d);
    }

    public static void main(String[] args)
    {
        interface40 obj=new interface40();
        obj.ak();
        obj.bk();
    }
}
