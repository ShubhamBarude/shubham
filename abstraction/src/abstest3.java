abstract class abstest3
{
    abstract void start();
}
class abstest03 extends abstest3
{
    void start()
    {
        System.out.println("enetr a bike name:");
    }
}
abstract   class abstest003 extends abstest03
{

    void start() {
        System.out.println("enter a name:");
        super.start();
    }
}
abstract class abstest0003 extends abstest003
{
    void bk()
    {
        System.out.println("enetr your class:");
    }
}
class abstest00003 extends abstest0003
{
    void dk()
    {
        System.out.println("enetr your city");
    }
    public static void main (String args[])
    {
        abstest00003 obj=new abstest00003();

        obj.start();
       // obj.ak();
        obj.bk();
        obj.dk();
    }
}