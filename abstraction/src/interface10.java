  interface interface10
{
    void test();
}

interface interface100 extends interface10
{
    void show();
}
class interface010 implements interface100
{
    @Override
    public void test() {
        System.out.println("enetr method 1A");
    }

    @Override
    public void show() {
        System.out.println("enetr method 2A");

    }

    public static void main(String[] args) {
        interface010 obj=new interface010();
        obj.show();
        obj.test();
    }
}

