public class test20 {
    int a=10;
    int b=20;
    int c=30;
    public void ak()
    {
        int d=a+b;
        System.out.println("enetr a add:"+d);
    }
}
class Test200 extends test20
{
    public void bk()
    {
        int e=b-a;
        System.out.println("enter a sub:"+e);
    }
    public static void main(String args[])
    {
        Test200 obj= (Test200)new  test20();//downcasting
        obj.ak();
        obj.bk();
    }
}
