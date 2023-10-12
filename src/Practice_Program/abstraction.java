package Practice_Program;

abstract class abstraction {
    abstract void ak(); // abstract method are public only
    void bk()
    {
        System.out.println("it is normal method:");
    }
}
abstract class abstraction1 extends abstraction
{

    abstract void ck();
    void dk()
    {
        System.out.println("it is normal method 2:");
    }
}
class abstraction2 extends abstraction1
{
    @Override
    void ak() {
        System.out.println("it is first abstract method:");
    }

    @Override
    void ck() {
        System.out.println("it is second abstract method:");
    }

    public static void main(String[] args) {
        abstraction2 obj=new abstraction2();
        obj.ak();
        obj.bk();
        obj.ck();
        obj.dk();
    }
}