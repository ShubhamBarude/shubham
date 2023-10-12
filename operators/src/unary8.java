public class unary8 {
    int a=20;
    int b=30;
    int c=10;
    int d=20;
    boolean  res=true;
    public void ak()
    {
        boolean res1=((a<b)==(a>c));
        System.out.println("enter cond:"+res1);
    }
    public void bk()
    {
        boolean res2=(a==d);
        System.out.println("enter cond:"+res2);
    }
    public void ck()
    {
        boolean res3=((a<c)==(b<d));
        System.out.println("enter cond;"+res3);
    }
    public static void main (String args[])
    {
        unary8 obj=new unary8();
        obj.ak();
        obj.bk();
        obj.ck();
    }
}
