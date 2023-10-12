package overloading;

public class over3
{
    int a=10;
    int b=20;
    String name="shubham";
    String city="pune";
    String ak()
    {
        System.out.println("enetr add:"+(a+b));
        return "gdfyth";
    }
    int ak(int n,boolean m)
    {
        System.out.println("enter a sub:"+(b-a));
        return 20;
    }
    double ak(String z,float y,byte x)
    {
        System.out.println("enetr mul:"+(a*b));
        return 25.12;
    }

    public static void main(String[] args) {
        over3 obj=new over3();
        obj.ak("shubham",0.12f,(byte)20);
        obj.ak(20,true);
        obj.ak();
    }
}
