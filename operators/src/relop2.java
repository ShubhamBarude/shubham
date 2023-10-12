public class relop2 {
    public void ak()
    {
        int a=10;
        int b=20;
        System.out.println(" enter rel:"+(a<b));
    }
    public void bk()
    {
        int a=40;
        int b=20;
        System.out.println("enter rel:"+(b>a));
    }
    public void ck()
    {
        int b=40;
        int a=40;
        System.out.println("enter a rel:"+(a==b));
        System.out.println("enter a rel:"+(a!=b));
    }
    public static void main(String args[])
    {
        relop2 obj=new relop2();
        obj.ak();
        obj.bk();
        obj.ck();
    }
}
