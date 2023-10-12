public class test03 {
    public char  gk( char a,char b)
    {
        System.out.println("enter a value");
        return a;


    }
}
class test3 extends test03{
    public static void main(String args[])
    {
        test3 dp=new test3();
       // dp.gk('l','s');
        char result=dp.gk('s','d');
        System.out.println("enetr "+result);
    }
}