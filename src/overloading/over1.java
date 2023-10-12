package overloading;

public class over1
{

    void add(int a,int b)
    {
        System.out.println("enetr add"+(a+b));
    }
   private void add(char a,String b)
    {
        System.out.println("enetr add3"+(a+b));
    }
    void sub(int a, int b,String name )
    {
        System.out.println("enter sub"+(a-b));
    }
  private   void add(int a,String b)
    {
        System.out.println("enetr add1"+a+" "+b);
    }
    void sub(String a,int b)
    {
        System.out.println("enetr sub1"+a+""+b);
    }
    void sub(String a)

    {
        System.out.println("enetr sub3"+a);
    }

    public static void main(String[] args) {
        over1 obj=new over1();
        obj.add(10,20);
        obj.add(30,"shubham");
        obj.sub("vision",74);
        obj.sub("latur",20);
        obj.add('h',"hdtfhed");
        obj.sub("ugxgf");
    }
}
