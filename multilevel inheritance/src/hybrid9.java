public class hybrid9
{
    int a=10;
    int b=20;
    int c=30;
}
class hybrid09 extends hybrid9
{
    void add()
    {
       int  result=a+b;
        System.out.println("enter a values add:"+result);
    }
}
class hybrid009 extends hybrid9
{
    int sub()
    {
        int result1=c-b;
        System.out.println("enter a values sub:"+result1);
        return 22;
    }
}
class hybrid0009 extends hybrid009
{
    boolean mul()
    {
        int result2=a*b;
        System.out.println("enter a mul:"+result2);
        return true;
    }
}
class hybrid00009 extends  hybrid0009
{
    char div()
    {
        int result3=b/a;
        System.out.println("enter a values div:"+result3);
        return 'h';
    }

    public static void main(String[] args) {
        hybrid00009 obj=new hybrid00009();
        hybrid09 obj1=new hybrid09();
        obj.div();
        obj.mul();
        obj.sub();
        obj1.add();

    }
}
