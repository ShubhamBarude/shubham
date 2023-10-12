interface interface7 {
    default void ak()
    {
        System.out.println("name");
    }
    void bk();
    int a=20;
    int b=10;
}

interface interface07 
{
    void ak();
}
class interface70 implements interface7,interface07
{
    @Override
    public void bk() {
        System.out.println("city");
    }

    @Override
    public void ak() {
        interface7.super.ak();
        System.out.println("school");
    }

    public static void main(String[] args) {
        interface70 obj=new interface70();
        obj.ak();
        obj.bk();
    }
}