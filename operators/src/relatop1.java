public class relatop1 {
    public void ak()
    {
        int a=10;
        int b=20;
        System.out.println("enetr a rel:"+(a<b));
    }
    public void bk() {
        int x = 20;
        int b = 30;
        boolean res = (b < x);
        System.out.println("enter a rel:" + res);
    }
    public void ck()
    {
        int z=50;
        int b=40;
        int a=((b+=10));
        boolean res1=(a==z);
        System.out.println("enetr a rel:"+res1);
    }
    public void dk()
    {
        int a=50;
        int b=40;
        boolean res2=(a!=b);
        System.out.println("enetr a rel:"+res2);
    }
    public static void main(String args[])
    {
        relatop1 obj=new relatop1();
        obj.ak();
        obj.bk();
        obj.ck();
        obj.dk();
    }
}
