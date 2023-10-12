package Practice_Program;

public class MultiLevelInheri
{
    int a;
    int b;
    void add(int a,int b)
    {
        int result=a+b;
        System.out.println("add:"+result);
    }
}
class MultiLevelInheri01 extends MultiLevelInheri
{
    void sub (int a ,int b)
    {
        int result1=a-b;
        System.out.println("enter a sub:"+result1);
    }
}
class MultiLevelInheri001 extends MultiLevelInheri01
{
    void mul(int a,int b)
    {
        int result2=a*b;
        System.out.println("enter a mul:"+result2);
    }

    public static void main(String[] args) {
        MultiLevelInheri001 obj=new MultiLevelInheri001();
        obj.add(20,30);
        obj.sub(50,20);
        obj.mul(4,5);
    }
}
