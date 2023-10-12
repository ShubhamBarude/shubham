public class multi1
{
    int a=10;
    int b=20;
    int c=30;
    static {
        System.out.println("jbxgjg");
    }
    void add()
    {
        System.out.println("enetr a add:"+(a+b));
    }
}
class multi01 extends multi1
{
    public void sub()
    {
        System.out.println("enetr a sub:"+(c-b));
    }
}
class multi001 extends multi01
{
    void mul()
    {
        System.out.println("enetr a mul:"+(a*c));
    }

    public static void main(String[] args) {
        multi001 obj=new multi001();
        obj.add();
        obj.sub();
        obj.mul();
    }
}