 class singletest
{
    int a=10;
    int c;
    int b=20;
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
class singletest01 extends singletest {
    void show() {
        System.out.println("add" +(a+b));
    }


    public static void main(String[] args) {
        singletest01 obj=new singletest01();
        obj.show();
    }
}
