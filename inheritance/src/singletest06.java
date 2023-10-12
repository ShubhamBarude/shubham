public class singletest06
{
    long mob_no=9325180505l;
    String name="shubham";
    int id =20;
    void mobile()
    {
        System.out.println("enetr your mobile number:"+mob_no);
    }
    void name()
    {
        System.out.println("enetr your name:"+name);
    }
}
class singletest006 extends singletest06
{
    void id()
    {
        System.out.println("enter your id:"+id);
    }

    public static void main(String[] args) {
        singletest006 obj=new singletest006();
        obj.id();
        obj.name();
        obj.mobile();
    }
}