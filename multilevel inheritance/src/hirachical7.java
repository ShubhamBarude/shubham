public class hirachical7
{
    int a=10;
    int b=20;
    int c=30;
}
class hirachical07 extends hirachical7
{
    void add()
    {
        int z=a+b;
        System.out.println("enter add:"+z);
    }
}
class hirachical007 extends hirachical7
{
    int sub()
    {
        int y=c-b;
        System.out.println("enter sub:"+y);
        return 20;
    }

    }
class hirchical0007 extends hirachical007{
    void mul()
    {
        int x=a*b;
        System.out.println("enetr mul:"+x);
    }
    public static void main(String[] args) {
        hirachical007 obj = new hirachical007();
        hirachical07 obj1 = new hirachical07();
        hirchical0007 obj2=new hirchical0007();
        obj.sub();
        obj1.add();
        obj2.mul();
    }
}
