public class hirech5 {
    String name="shubham";
    int house=10;
    long contact=932518050;
    String city="latur";
    long pincode=413512;
    public void ak()
    {
        System.out.println("your name:"+name);
    }
}
class hirech05 extends hirech5
{
    public void bk()
    {
        System.out.println("house number:"+house);
    }
}
class hirech005 extends hirech5
{
    public void ck()
    {
        System.out.println("contact number:"+contact);
    }
}
class hirech0005 extends hirech05
{
    public void dk()
    {
        System.out.println("your city name:"+city);
    }
}
class hirech00005 extends hirech05
{
    public void ek()
    {
        System.out.println("your pincode:"+pincode);
    }
    public static void main(String args[])
    {
        hirech00005 obj=new hirech00005();
        obj.ak();
        obj.bk();
        obj.ek();
        hirech0005 obj1=new hirech0005();
        obj1.dk();
        hirech005 obj2=new hirech005();
        obj2.ck();
    }
}
