public class unaryop1 {
    int a=10;
    public void ak()
    {

                          //postincrement
System.out.println("enter a number:"+(a++));
System.out.println("enter post number"+a);


    }
    public void display()
    {
        int b=20;
                                       //postdecrement
      System.out.println("enetr unary op:"+(b--));
      System.out.println("enter a post"+b);

    }
    public static void main(String args[])
    {
        unaryop1 obj=new unaryop1();
        obj.ak();
        obj.display();
    }
}
