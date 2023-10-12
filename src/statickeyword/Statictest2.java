package statickeyword;

public class Statictest2
{
    static String name="shubham";
    int id =10;
    static String city="pune";
    public static void main(String[] args) {
      Statictest2 obj=new Statictest2();
        Statictest2 obj1=new Statictest2();
        obj.name="akash";
        obj.id=20;
        obj.city="latur";
        obj.name="saurab";
        obj1.name="ashish";

        System.out.println("enter a name :"+obj.name);
        System.out.println("enter a id:"+obj.id);
        System.out.println("enter a city:"+obj.city);

        obj1.name="akash";
        obj1.id =13;
        obj1.city="udgir";
        obj.name="akshay";

        System.out.println("enter a name :"+obj1.name);
        System.out.println("enter a id:"+obj1.id);
        System.out.println("enter a city:"+obj1.city);
    }
}
