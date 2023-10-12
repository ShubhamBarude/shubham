package statickeyword;

public class Statictest5
{
    static String name="shubham";
    static String city="latur";
    int id=20;
    Statictest5()
    {

        System.out.println("enter a name:"+name);
    }
    Statictest5(int a,int b)
    {
        this();
        Statictest5 obj1=new Statictest5();

        System.out.println("enter a city:"+obj1.city);
    }
}
class Statictest05 extends Statictest5
{
 String city="pune";
    Statictest05()
    {
        super(10,30);
        System.out.println("enter a city:"+city);
    }

    public static void main(String[] args) {
        Statictest05 obj=new Statictest05();
    }
}