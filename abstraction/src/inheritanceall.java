public class inheritanceall
{
    int a=30;
    int b=10;
}
class inheritanceall01 extends inheritanceall
{
    void add()
    {
        System.out.println("enetr add:"+(a+b));
    }
}
class inheritanceall001 extends inheritanceall
{
    void sub()
    {
        int a=40;
        int b=20;
        System.out.println("enter sub:"+(a-b));
    }
}
class inheritanceall0001 extends inheritanceall001
{
    void mul()
    {
        System.out.println("enetr mul:"+(a*b));
    }
}
class inheritanceall00010 extends inheritanceall0001
{
    void div()
    {
        System.out.println("enetr div:"+(a/b));
    }

    public static void main(String[] args) {
        inheritanceall00010 obj=new inheritanceall00010();
        inheritanceall01 obj1=new inheritanceall01();
        obj1.add();
        obj.div();
        obj.mul();
        obj.sub();
    }
}
