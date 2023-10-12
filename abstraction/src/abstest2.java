

 abstract class abstest2
 {
     abstract int start();
     static{
         System.out.println("static intiolization block:");
     }
     abstest2()
     {
         System.out.println("constuctor");
     }
}
class abstest02 extends abstest2
{

    int start()
    {
        System.out.println("start with key:");
        return 0;
    }
}
class abstest002 extends abstest02
{

    int start()
    {
        System.out.println("start with kick:");
        return 0;
    }
    public static void main(String args[])
    {
        abstest002 obj=new abstest002();
        abstest02 obj1=new abstest02();
        obj.start();
     obj1.start();
    }
}
