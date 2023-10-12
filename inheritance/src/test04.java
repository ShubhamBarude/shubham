public class test04 {

public int bk()
{
    int a=10;
    int b=20;
   int c=a+b;
    System.out.println("eneter");
    return c;

}
}
class test4 extends test04
{
    public static void main(String args[])
    {
        test4 lk=new test4();
       lk.bk();


     // int result=lk.bk();
        System.out.println("yftu"+lk.bk());

    }
}