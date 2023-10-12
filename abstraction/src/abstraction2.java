abstract class abstraction2
{
    abstract String name();
    void city()
    {
        System.out.println("enter a cityname");
    }
}
abstract class  abstraction02 extends abstraction2
{
    @Override
    String name() {
        System.out.println("my name is shubham");
        return null;
    }
}
class abstraction002 extends abstraction02
{
    int ak()
    {
        System.out.println("enetr your location");
        return 30;
    }

    public static void main(String[] args) {
        abstraction002 obj=new abstraction002();
        obj.ak();
        obj.name();
        obj.city();
    }
}

