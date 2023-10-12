public class test4
{
    int a=30;
    int b=10;
    boolean c=true;
    char d='l';
    public void ak()
    {
        int y= a+b;
        System.out.println("add"+y);
    }
}
class test04 extends test4
{
    public void bk()
    {
        int x=a-b;
        System.out.println("enter sub"+x);
    }
}
class test004 extends test04
{
    public void ck()
    {
        System.out.println("enter a boolean value"+c);
    }
}
class test0004 extends test004
{
    public void dk()
    {
        System.out.println("enter a char"+d);
    }
    public static void main(String args[])
    {
        test0004 zk=new test0004();
        zk.ak();
        zk.bk();
        zk.ck();
        zk.dk();

    }
}


