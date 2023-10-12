public class singletest2
{
    int a=30;
    int b=20;
    public void sub()
    {
        System.out.println("sub"+(a-b));
    }
    public void add()
    {
        int result=a+b;

    }
}
class singletest02 extends singletest2
{
    public void show()
    {
        System.out.println("result:"+(a+b));
    }

    public static void main(String[] args) {
        singletest02 obj=new singletest02();
        obj.show();
        obj.sub();
    }
}