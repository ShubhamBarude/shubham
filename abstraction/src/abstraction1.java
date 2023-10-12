abstract class abstraction1
{
    int a=20;
    int b=30;
    abstract void add();
    int z=b-a;
    void sub()
    {

        System.out.println("enetr your name:");
    }
}
class abstraction01 extends abstraction1
{
    @Override
    void add() {
        System.out.println("enetr add:"+(a+b));
    }
}
abstract class abstraction001 extends abstraction1 {
    abstract void show();
}
    class abstraction0001 extends abstraction001
    {
        @Override
        void show() {
            System.out.println(" show:"+z);
        }

        @Override
        void add() {

        }

        public static void main(String[] args) {
        abstraction01 obj=new abstraction01();
            abstraction0001 obj1=new abstraction0001();
        obj.sub();
        obj1.show();
        obj.add();
    }
}