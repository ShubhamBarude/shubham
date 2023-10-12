public class upcasting1
{
    void  A()
    {
        System.out.println("eneter a name");
    }
}
class upcasting01 extends  upcasting1
{
    @Override
    void A() {
        System.out.println("enetr method name");
        super.A();
    }

    int B()
    {
        System.out.println("your city");
        return 20;
    }

}
class upcasting001 extends upcasting01
{
    long c()
    {
        System.out.println("enetr your location");
        return 984654655l;
    }

    public static void main(String[] args) {
        upcasting1 obj=new upcasting01();   //upcasting
       // reference type=object type
       // upcasting001 obj1=(upcasting001)new upcasting1(); //downcasting
        obj.A();
       // obj1.c();
      //  obj1.B();

    }

}