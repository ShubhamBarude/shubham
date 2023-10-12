public class relaop4
{
    public void ak()
    {
        int a=20;
        int b=30;
        boolean res=((a<b)&&(a>b));
        System.out.println("enter a value:"+res);
    }
    public void bk()
    {
        int a=40;
        int b=20;
        boolean res1=((a>b)||(a<b));
        System.out.println("enter a rel:"+res1);
    }
    public static void main(String args[])
    {
        relaop4 obj=new relaop4();
        obj.ak();
        obj.bk();
    }
}
