public class PraMultiLevInher
{
    int a=10;
    int b=20;
    int c=30;
    void add()
    {
         int result=c+b;
        System.out.println("enter addition of c & b:"+result);
    }
}
class PraMultiLevInher1 extends PraMultiLevInher
{
    void sub()
    {
        int result1=c-a;
        System.out.println("enter sub of c & a:"+result1);
    }
}
class PraMultiLevInher2 extends PraMultiLevInher1
{
    void mul()
    {
        int result2=a*b;
        System.out.println("enter a mul a & b:"+result2);
    }
}
class PraMultiLevInher3 extends PraMultiLevInher2
{
    void div()
    {
        int result3=c/a;
        System.out.println("enter a div c & a:"+result3);
    }

    public static void main(String[] args) {
        PraMultiLevInher3 obj=new PraMultiLevInher3();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
