 public class ambtest1 {
    int a=10;
    int b=20;
    public void ak()
    {
        int c=a+b;
        System.out.println("enter a add:"+c);
    }
}
  class ambtest01 extends ambtest1 {
     public void ak() {
         int b = 40;
         int a = 20;
         int d = b - a;
         System.out.println("enter a sub:" + d);
     }
 }

    class ambtest001 extends ambtest01
    {
        public void ak()
        {
            int e=a*b;
            System.out.println("enter mul:"+e);
        }

    public static void main(String args[])
    {
        ambtest01 as =new ambtest01();
        ambtest1 obj=new ambtest1();
        obj.ak();
        obj.ak();
        obj.ak();


    }
}
