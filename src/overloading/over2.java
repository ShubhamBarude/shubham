package overloading;

public class over2
{
    String ak()
    {
        System.out.println("enetr a method 1A");
        return "hgfdx";
    }
    int ak(int a,boolean b)
    {
        System.out.println("enetr a method 1B");
        return 20;
    }
    static {
        System.out.println("enter a static intilization block:");
    }
    {
        System.out.println("instance intilization block:");
    }
    over2()
    {
        System.out.println("constructor");
    }
    double ak(boolean a,int b)
    {
        System.out.println("enetr a method 1C");
        return 45.23;
    }
    boolean ak(int a,String b,double c)
    {
        System.out.println("enetr a method 1D");
        return true;
    }
        String bk()
        {
            System.out.println("enetr a method 2A");
            return "kdjj";
        }
        int bk(int a,int b)
        {
            System.out.println("enetr a method 2B");
            return 89;
        }
        double bk(int n,boolean m)
        {
            System.out.println("enter a method 2C ");
            return 65.214;
        }

    public static void main(String[] args) {
        over2 obj=new over2();
        obj.ak();
        obj.ak(true,56);
        obj.ak(54,false);
        obj.ak(10,"shubha",78.102);
        obj.bk();
        obj.bk(41,20);
        obj.bk(10,true);

    }
}
