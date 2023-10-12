public class assgnop4 {
    public void ak()
    {
        int a=40;
        int b=20;
        boolean res=((a-=b)==(b+=b));
        System.out.println("enter a value :"+res);
    }
    public void bk()
    {
        int a=40;
        int b=30;
        boolean res1=((b+=10)!=(a-=10));
        System.out.println("enter a value:"+res1);
    }
    public static void main(String args[])
    {
        assgnop4 obj=new assgnop4();
        obj.ak();
        obj.bk();
    }
}
