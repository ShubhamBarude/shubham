public class singletest3
{
    String name="shubham";
    String city="latur";
    int id=20;
    void name()
    {
        System.out.println("enetr your name:"+name);
    }
    int city()
    {
        System.out.println("enetr  your city:"+city);
        return 20;
    }
}
class singletest03 extends singletest3
{
    void show()
    {
        System.out.println("enetr a id"+id);
    }

    public static void main(String[] args) {
        singletest03 obj=new singletest03();
        obj.name();
        obj.city();
        obj.show();
    }
}