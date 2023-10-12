interface interfmulttest1       //in interface all method are abstract only
{
    void dis();         //in interface all method are in public only
    int a=10;

}
interface interfmulttest2
{
    void show();           //we are not declear public method then compiler automatically declear public
    public static final int b=20;    //all veriable are in public static final
}
class interfmulttest01 implements interfmulttest2,interfmulttest1    //interface is inherite class with implements keyword
{                                             // interface can inherite multiple class line(10)
                                                   //interface to interface implements keyword
                                                   //other class extends keyword we ues
    @Override
    public void dis()                     //in first class method is public so it should declear public in method body also
    {
        System.out.println("name:");
    }

    @Override
    public void show() {
        System.out.println("city");
    }
    void res()
    {
        int z=a+b;
        System.out.println("enetr a add:"+z);
    }

    public static void main(String[] args)
    {
        interfmulttest01 obj=new interfmulttest01();   //Interface can not create of an object
        obj.dis();
        obj.show();
        obj.res();

    }
}

