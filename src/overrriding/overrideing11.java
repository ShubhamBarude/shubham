package overrriding;

public class  overrideing11
{
    int a=10;
    int b=20;
    void add(byte a)
    {
        System.out.println("enetr your name:");
    }
    void sub()
    {
        System.out.println("enetr your city:");
    }
    overrideing11()
    {
        System.out.println("construcr");
    }
}
class overrideing011 extends overrideing11
{
    @Override
    void add(byte a) {
        System.out.println("enetr a addtion result:"+(a+b));
    }

    @Override
    void sub() {
        System.out.println("enetr a sub result:"+(a-b));
    }

    public static void main(String[] args) {
        overrideing11 obj=new overrideing011();
        obj.add((byte)10);
        obj.sub();

    }
}