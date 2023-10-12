public class unary6 {
    int a=60;
    int b=20;
    boolean cond=true;
    public void ak()
    {
        boolean res=!(a<b);
        System.out.println("enter cond :"+res);
    }
    public void bk()
    {
        boolean res1=!(a>b);
        System.out.println("enter cond :"+res1);
    }
    public static void main(String args[])
    {
        unary6 obj=new unary6();
        obj.ak();
        obj.bk();
    }
}
