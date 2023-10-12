public class singletest4
{
    int a=10;
    int b=20;
    void mul()
    {
        System.out.println("mul"+(b*a));
    }
}
class singletest04 extends singletest4
{
    void add()
    {
        System.out.println("enetr a add"+(a+b));
    }
}
class singletest004 extends singletest04
{
    void sub()
    {
        System.out.println("enetr sub"+(a-b));
    }

    public static void main(String[] args) {
        singletest004 obj=new singletest004();
        obj.mul();
        obj.add();
        obj.sub();
    }
}