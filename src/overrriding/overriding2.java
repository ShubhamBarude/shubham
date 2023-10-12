package overrriding;

public class overriding2
{
    int a=10;
    int b=30;
    void ak(int a,int b)
    {
        System.out.println("add"+(a+b));

    }
    int sub(int a,int b)
    {
        System.out.println("entr sub:"+(a-b));
        return 10;
    }
}
class overriding02 extends overriding2
{
    @Override
    void ak(int a, int b) {
        System.out.println("enetr  a result"+(a+b));
    }

    public static void main(String[] args) {
        overriding2 obj=new overriding02();
        obj.ak(10,30);
        obj.sub(35,41);
    }
}
