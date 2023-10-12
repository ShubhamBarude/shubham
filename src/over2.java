public class over2
{
    int ak()
    {
        System.out.println("enetr a method 1");
        return 10;
    }
    int ak(int a,int b)
    {
        System.out.println("enetr amethod 2"+a+" "+b);
        return 20;
    }
    int ak(int a,boolean b,char c)
    {
        System.out.println("enetr method 3"+a+" "+b+" "+c);
        return 96;
    }
    int ak(String b)
    {
        System.out.println("enetr a method 4"+b);
        return 56;
    }
    long bk(String a)
    {
        System.out.println("enetr a method 1A"+a);
        return 6486442l;
    }
    long bk(int a,boolean b)
    {
        System.out.println("enetr a method 2A"+a+" "+b);
        return 64854l;

    }
    long bk()
    {
        System.out.println("enetr a method 2B");
        return 66885465l;
    }

    public static void main(String[] args) {
        over2 obj=new over2();
        obj.ak();
        obj.ak("shubham");
        obj.ak(10,20);
        obj.ak(10,true,'b');
        obj.bk();
        obj.bk("pune");
        obj.bk(20,false);
    }
}
