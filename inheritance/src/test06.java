public class test06 {
    public String hk(){

        System.out.println("enter a parent class method");
        return "shubham";
    }
public char jk()
{
 System.out.println( " char is");
 return 'm';
}
}
class test6 extends test06{
    void add()
    {
        System.out.println("enter a childclass message:");
    }
    public static void main (String args[])
    {
        test06 sk=new test6();


        sk.hk();
        sk.jk();
        System.out.println("enter a name"+sk.hk());
        System.out.println("enter a char"+sk.jk());
    }
}