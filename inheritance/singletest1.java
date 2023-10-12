public class singletest1
{
    int value()
    {
        int a=10;
        int b=20;
        return 20;
    }
    void add()
    {
        int c=a+b;
    }
}
class singletest01 extend singletest1
{
    void show() {
        system.out.println("add" + c);
    }

    public static void main(String[] args) {
        singletest01 obj=new singletest01();
        obj.show();
    }
}