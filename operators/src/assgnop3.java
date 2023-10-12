public class assgnop3 {
    public void ak()
    {
        boolean a=true;
        int b=30;
        int c=20;
        boolean res=((c+=10)==b);
        System.out.println("enter a valur:"+res);
    }
    public void bk()
    {
        int a=20;
        int b=30;
        boolean res1=((b-=10)==a);
        System.out.println("enter a value:"+res1);
    }
    public void ck()
    {
        short a=40;
        short b=20;
        boolean res2=((a/=b)==b);
        System.out.println("enter a value:"+res2);
    }
    public void dk()
    {
        byte a=20;
        byte b=10;
        boolean res3=((a*=b)==b);
        System.out.println("enter a value:"+res3);
    }
    public void ek()
    {
        int a=30;
        int b=10;
        int c=0;
        boolean res4=((a%=b)==c);
        System.out.println("enter a value :"+res4);
    }
    public static void main(String args[])
    {
        assgnop3 obj=new assgnop3();
        obj.ak();
        obj.bk();
        obj.ck();
        obj.dk();
        obj.ek();
    }
}
