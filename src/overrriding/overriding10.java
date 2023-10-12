package overrriding;

public class overriding10
{
//    int a=10;
//    int b=30;
//    String name="shubham";
//    char z='j';

    overriding10 ak(int a,int b)
    {
        overriding10 obj=new overriding10();
        System.out.println("enetr method 1A");
        return obj;
    }
    overriding10 bk(String name,char z)
    {
        overriding10 obj1=new overriding10();
        System.out.println("enetr method 1B");
        return obj1;
    }
}
class overriding010 extends overriding10
{
    @Override
    overriding010 ak(int a, int b) {
        overriding010 ref=new overriding010();
        System.out.println("enetr method 2A"+(a+b));
        return ref;
    }

    @Override
    overriding010 bk(String name,char z)
    {
        overriding010 ref1=new overriding010();
        System.out.println("enter method 2B"+name+" "+z);
        return ref1;
    }
//    class overriding0100 extends overriding010 {
//        @Override
//        overriding0100 ak(int a, int b) {
//            overriding0100 ref2 = new overriding0100();
//            System.out.println("enetr method 2C" + (b - a));
//            return ref2;
//        }

        public static void main(String[] args) {
            overriding10 ref2 = new overriding010();
           // overriding10 ref3 = new overriding0100();
            ref2.ak(20, 30);
            ref2.bk("shubham", 'd');
        }
    }




