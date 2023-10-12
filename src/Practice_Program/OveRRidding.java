package Practice_Program;

public class OveRRidding
{
    void add(int a ,int b)
    {
        System.out.println("it is first method :");
    }
    void sub(int a,int b )
    {
        System.out.println("it is second method:");
    }
    static{
        System.out.println("it is static block:");
    }
    static void mul()
    {
        System.out.println("it is static method");
    }
    {
        System.out.println("enter a iib");
    }
    OveRRidding()
    {
    }
}
class OveRRidding1 extends OveRRidding
{

    @Override
    void add(int a, int b) {
        System.out.println("it is overring method :");
        super.add(a, b);

    }

    @Override
    void sub(int a, int b) {
        System.out.println("enter is overriding method2");
        super.sub(a, b);
    }

    public static void main(String[] args) {
        OveRRidding1 obj=new OveRRidding1();
        obj.sub(20,30);
        obj.add(14,56);
        OveRRidding.mul();

    }

}