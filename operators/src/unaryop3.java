public class unaryop3 {
   int a=30;
   int b=40;
    public void ak()
    {

                 //pre-increment
        System.out.println("pre_increment:"+(++a));
        System.out.println("pre inc:"+(++a));
        System.out.println("pre inc:"+(+a));

    }
    public void bk()
    {

      System.out.println("pre_decrement:"+(--b));
        System.out.println("pre inc:"+(--b));
        System.out.println("pre inc:"+(+b));
   }
    public static void main(String args[])
    {
        unaryop3 obj=new unaryop3();
        obj.ak();
        obj.bk();
    }
}
