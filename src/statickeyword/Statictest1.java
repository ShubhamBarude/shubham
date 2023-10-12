package statickeyword;

public class Statictest1
{
  static int a=10;
    int b=20;
    Statictest1()
    {
        a++;
        b++;
        System.out.println("enetr a values A:"+a);
        System.out.println("enter a values B:"+b);
    }

    public static void main(String[] args) {
        Statictest1 obj=new Statictest1();
        Statictest1 obj1=new Statictest1();
        Statictest1 obj2=new Statictest1();
    }
}
