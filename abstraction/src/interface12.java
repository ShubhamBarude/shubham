import java.sql.SQLOutput;

interface interface12
{

    int id();
    String location();
}
interface interface012 {
    String name();

    String city();
}
abstract class interface0012 implements interface012
{
    abstract void mob_name();
}
class interface0120 extends interface0012 implements interface012,interface12
{
    @Override
    void mob_name() {
        System.out.println("enetr your mob_no:");
    }

    @Override
    public String name() {
        System.out.println("enetr your name:");
        return null;
    }

    @Override
    public String city() {
        System.out.println("enetr your city");
        return null;
    }

    @Override
    public String location() {
        System.out.println("enetr your location");
        return null;
    }

    @Override
    public int id() {
        System.out.println("enetr your id");
        return 0;
    }

    public static void main(String[] args) {
        interface0120 obj=new interface0120();
        obj.id();
        obj.city();
        obj.location();
        obj.name();
        obj.mob_name();
    }
}