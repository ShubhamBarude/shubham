public class program1 {
    int a=10;
    int b=20;
  public void ak()
    {
        int c=a+b;
        System.out.println("enter add:"+c);
    }
    program1() //default constructor
    {
        int d=b-a;
        System.out.println("enter sub:"+d);
    }
    program1(int a)//     parametric constructor
    {
        System.out.println("enter a value "+a);
    }
    public static void main(String args[])
    {
        program1 obj=new program1(10);
        obj.ak();
    }

}
