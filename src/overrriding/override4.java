package overrriding;

public class override4
{
    int ak()
    {
        String name="shubham";
        System.out.println("enetr "+name);
        return 10;
    }
    int bk()
    {
        String city="latur";
        System.out.println("enetr "+city);
        return 20;
    }
}
class override04 extends override4
{
    String name="akash";
    String city="pune";
    @Override
    int ak() {
        System.out.println("enetr second "+name);
        return 2;
    }

    @Override
    int bk() {
        System.out.println("enter second"+city);
        return 10;
    }

    public static void main(String[] args) {
        override4 obj=new override04();
        obj.ak();
        obj.bk();
    }
}
