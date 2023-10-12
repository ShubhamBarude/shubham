public class singletest08
{
    int a=10;
    float b=2.33f;
    public void add()
    {
        System.out.println("enter add :"+(a+b));
    }
    public void sub()
    {
        System.out.println("sub"+(a-b));
    }
}
class singletest008 extends singletest08
{
    void mul()
    {
        System.out.println("mul:"+(a*b));
    }

    public static void main(String[] args) {
        singletest008 obj=new singletest008();
        obj.add();
        obj.sub();
        obj.mul();
    }
}