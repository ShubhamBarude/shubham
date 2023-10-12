public class assgnop {
    int a=10;
    int b=30;
    int c=40;
    public void ak()
    {
        int res=(a+=5);
        System.out.println("enter a value :"+res);
    }
    public void bk()
    {
        int res1=(b-=5);
        System.out.println("enter a value :"+res1);
    }
    public void ck()
    {
        int res2=(a*=2);
        System.out.println("enter a value:"+res2);
    }
    public void dk() {
        int res3 = (c /= 20);
        System.out.println("enter a value :"+res3);
    }
    public void ek()
    {
        int res4=(b%=10);
        System.out.println("enter a value :"+res4);
    }
    public static void main(String args[])
    {
        assgnop obj=new assgnop();
        obj.ak();
        obj.bk();
        obj.ck();
        obj.dk();
        obj.ek();
    }
}
