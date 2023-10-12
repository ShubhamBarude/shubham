abstract class abstaction4
{
     int a=20;
     int b=10;
     abstract void add();
    abstaction4()
    {
        System.out.println("constructor");
    }
     void sub()
     {
         int z=b-a;
         System.out.println("enetr a sub:"+z);
     }
     static{
         System.out.println("it is static block");
     }
     static void sauarab()
     {
         System.out.println("enter a static method");
     }
}
abstract class abstraction04 extends abstaction4
{
    @Override
    void add() {
        System.out.println("add"+(a+b));
    }
}
class abstraction004 extends abstraction04
{
    void ak()
    {
        System.out.println("enetr your name:");
    }

    public static void main(String[] args) {
//        abstraction004 obj=new abstraction004();
       // abstaction4 obj1=new abstaction4();
//        obj.ak();
//        obj.add();
//        obj.sub();
        abstaction4.sauarab();
    }


}