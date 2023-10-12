public class singletest5
{
    String name= "vision";
    String location="warje";
    String city="pune";
    void name()
    {
        System.out.println("enter a class name:"+name);
    }
    void location()
    {
        System.out.println("class location:"+location);
    }
}
class singletest05 extends singletest5
{
    void city()
    {
        System.out.println("city name:"+city);
    }

    public static void main(String[] args) {
        singletest05 obj=new singletest05();
        obj.name();
        obj.location();
        obj.city();
    }
}