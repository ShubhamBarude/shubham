package overrriding;

public class overriding3
{
    void mul(int a,int b)
    {
        System.out.println("enetr a mul"+(a*b));
    }
    void div(int a,int b)
    {
        System.out.println("enetr a div:"+(b/a));
    }
}
class override03 extends overriding3
{
    @Override
    void mul(int a, int b) {
        System.out.println("enetr a result:"+(a+b));
    }

    @Override
    void div(int a, int b) {
        System.out.println("enetr a result div:"+(b/a));
    }
}
class override003 extends override03
{
    @Override
    void div(int a, int b) {
        System.out.println("enetr a add:"+(a+b));
    }

    @Override
    void mul(int a, int b) {
        System.out.println("enetr a sub:"+(a-b));
    }

    public static void main(String[] args) {
        overriding3 obj=new override003();
        overriding3 obj1=new override03();
        obj.div(20,40);
        obj.mul(10,30);
        obj1.mul(100,200);
        obj1.div(10,20);
    }
}