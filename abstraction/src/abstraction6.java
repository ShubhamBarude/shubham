abstract class abstraction6
{
    abstract void name();
    int id=10;
    String name;
    void day()
    {
        System.out.println("enetr a mon:");
    }
}
abstract class abstraction06 extends abstraction6
{
    String name;
//    abstraction06()
//    {
//        System.out.println("enetr a construct");
//    }
    void name() {
        System.out.println("enetr name:"+name);
    }

}
class abstraction006 extends abstraction06
{
    void ak()
    {
        System.out.println("method no 3");
    }

    public static void main(String[] args) {
        abstraction006 obj=new abstraction006();
        obj.name();
        obj.ak();
        obj.day();
    }
}
