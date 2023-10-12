interface  interface3
{
//    interface3()
//    {
//
//    }
//    void ak()
//    {
//
//    }
//    void test();
    public void ak();
     int a=10;
     public static final int b=20;
}
interface interface03
{
    public int bk();
    default void shubham()
    {

    }
    static void get()
    {
        System.out.println("entser static void method:");
    }

    public static void main(String[] args) {
        get();

    }
}
class test589
{
  //  @Override
    public int bk() {
        return 0;
    }

}
class interface30 implements interface03,interface3
{
    @Override
    public void ak() {
       int c=a+b;
       System.out.println("enetr a add:"+c);
    }

    @Override
    public int bk() {
        int d=b-a;
        System.out.println("enetr a sub:"+d);
        return 0;
    }


    public static void main(String[] args) {
        interface03 obj= new interface03() {
            @Override
            public int bk() {
                return 0;
            }
        };


      //  interface3 obj=new interface3();
    //    obj.ak();
        obj.bk();
        obj.shubham();
    }
}
