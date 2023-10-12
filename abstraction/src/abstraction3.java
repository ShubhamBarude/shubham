abstract class abstraction3
{
    abstract void car();

    long mob_no=9325180505l;
    void mob_no()
    {
        System.out.println("enetr mobile no:"+mob_no);
    }
    static{
        System.out.println("sib");
    }
    {
        System.out.println("iib");
    }
}
abstract class abstraction03 extends abstraction3
{
    abstract void name();
}
class abstraction003 extends abstraction03
{
    @Override
    void name() {
        System.out.println("enetr a name:");
    }

    @Override
    void car() {
        System.out.println("enetr your car name");

    }

    public static void main(String[] args) {
        abstraction003 obj=new abstraction003();
        obj.car();
        obj.mob_no();
        obj.name();
    }
}