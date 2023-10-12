package overrriding;

public class overriding
{
    void ak()
    {
        System.out.println("enter a method 1:");
    }
    void bk()
    {
        System.out.println("enetr a method 2:");
    }
}
class override5 extends overriding
{
    @Override
    void ak() {
        System.out.println("enetr a method 1A");
    }

    @Override
    void bk() {
        System.out.println("enetr a method 2A");
    }

    public static void main(String[] args) {
        overriding obj=new override5();
        obj.ak();
        obj.bk();
    }
}
