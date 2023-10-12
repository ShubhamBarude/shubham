public class test02
{
   static int a=20;
    int b=30;
    long sub(int a,int b)
    {
        System.out.println("enter");
        return a-b;

    }

    static {
        System.out.println("static block");
        }
    test02()
    {
        System.out.println("constructor");
    }
    {
        System.out.println("instance itilization block");
    }
}
class test2 extends test02{
    int add()
    {
        System.out.println("enetr a add:"+(a+b));
        return 20;
    }


    public static void main (String args[])
    {
        test2 bk=new test2 ();
       // bk.sub(30,10);
        bk.add();
        long result= bk.sub(30,10);
        System.out.println("j"+result);

    }
}