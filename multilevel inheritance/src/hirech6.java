public class hirech6 {
    String mobile="realme";
    long price=25000;
    short camera=108;
    int version=13;
    String display="amoled";
    public void ak()
    {
        System.out.println("mobile company:"+mobile);
    }
}
class hirech06 extends hirech6
{
    public void bk()
    {
        System.out.println("mobile price"+price);
    }
}
class hirech006 extends hirech6
{
    public void ck()
    {
        System.out.println("camera  in megapixel:"+camera);
    }
}
class hirech0006 extends hirech06
{
    public void dk()
    {
        System.out.println("android version:"+version);
    }
}
class hirech00006 extends hirech06
{
    public void ek()
    {
        System.out.println("disply type:"+display);
    }
    public static void main (String args[])
    {
        hirech00006 obj=new hirech00006();
        obj.ak();
        obj.bk();
        obj.ek();
        hirech0006 obj1=new hirech0006();
        obj1.dk();
        hirech006 obj2=new hirech006();
        obj2.ck();
    }
}