interface  interface5
{
    void start();
    int add();
    byte sub();
    String mul();
    char div();
}
interface interfacce05
{
    int a=10;
    byte b=20;
    short c=30;
    long d=40;
}
class interface50 implements interface5,interfacce05
{
    @Override
    public void start()
    {
        int z=(int)d-a;
        System.out.println("enter a sub:"+z);
    }

    @Override
    public int add() {
        int y=a+b;
        System.out.println("enter a add:"+y);
        return 0;
    }

    @Override
    public byte sub() {
       int x=c-a;
        System.out.println("enetr sub:"+x);
        return 0;
    }

    @Override
    public String mul() {
        int v=c*b;
        System.out.println("enter a mul:"+v);
        return null;
    }

    @Override
    public char div() {
        int s=(int)d/b;
        System.out.println("enter a div:"+s);
        return 0;
    }

    public static void main(String[] args)
    {
        interface50 obj=new interface50();
        obj.start();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
