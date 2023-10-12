 abstract class PraAbstarction
{
    abstract void add();
    void sub()
    {
        System.out.println("enter a sub:");
    }
}
class PraAbstarction1 extends PraAbstarction
{
    @Override
    void add() {
        System.out.println("ytfytdyfg");
    }

    public static void main(String[] args) {
        PraAbstarction1 obj=new PraAbstarction1();
        obj.add();
        obj.sub();
    }
}

