public class assgnop2 {
    public void ak()
    {
        int a=10;
        int b=30;
        int res=(a+=b);
        System.out.println("enter a value :"+res);
    }
    public void bk()
    {
        byte a=40;
        byte b=20;
        byte res1=(a-=b);
        System.out.println(" enter a value :"+res1);
    }
    public void ck()
    {
        short a=30;
        short b=20;
        short res2=(a*=b);
        System.out.println("enter a value :"+res2);
    }
    public void dk()
    {
        int a=40;
        int b=20;
        int res3=(a/=b);
        System.out.println(" enter a value :"+res3);
    }
    public void ek()
    {
        int a=30;
        int b=10;
        int res4=(a%=b);
        System.out.println("enter a value :"+res4);
    }
    public static void main(String args[])
    {
        assgnop2 obj=new assgnop2();
        obj.ak();
        obj.bk();
        obj.ck();
        obj.dk();
        obj.ek();
    }
}
