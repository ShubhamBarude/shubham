public class relaop3
{
public void ak()
{
    int a=30;
    int b=20;
    System.out.println("enter a rel:"+(a>=b));
}
public void bk()
{
    int a=20;
    int b=30;
    System.out.println("enter a rel:"+(a<=b));
}
public void ck()
{
    int a=40;
    int b=20;
    System.out.println("enter a rel:"+(a==b));
}
public static void main(String args[])
{
    relaop3 obj=new relaop3();
    obj.ak();
    obj.bk();
    obj.ck();
}
}
