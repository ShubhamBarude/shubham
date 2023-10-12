public class test10 {
    int a = 50;
    int b = 20;


    public void ak() {
        int d = b - a;
        System.out.println("enter a :" + d);
    }
}
    class test100 extends test10
    {
        public void bk() {

            int c = a + b;
            System.out.println("enter :"+c);
        }
        public static void main (String args[])
        {
            test10 obj=new test100();//upcasting
         obj.ak();
           System.out.println(" "+obj.a);

        }


    }

