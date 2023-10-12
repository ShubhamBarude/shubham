public class unaryop2 {
    int a = 60;

    int b = 30;

    public void inc() {
                                  //postincrement
        System.out.println("increment:" +(a++));
        System.out.println("post :"+a);
    }

    public void dec()
    {
                                      //postdecrement
        System.out.println("decrement:"+(b--));
        System.out.println("post:"+b);
    }
    public static void main(String args[])
    {
        unaryop2 obj=new unaryop2();
        obj.inc();
        obj.dec();
    }

}
