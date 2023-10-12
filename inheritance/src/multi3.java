public class multi3
{
    long mob_no=9325180505l;
    String class_name="vision";
    String city="pune";
}
class multi03 extends multi3
{
    void mobile()
    {
        System.out.println("enetr your mobile no:"+mob_no);
    }
}
class multi003 extends multi03{
    void class_name()
    {
        System.out.println("enter your class name:"+class_name);
    }
}
class multi0003 extends multi003
{
    void city()
    {
        System.out.println("enter your city name"+city);
    }

    public static void main(String[] args) {
        multi0003 obj=new multi0003();
        obj.class_name();
        obj.city();
        obj.mobile();
    }
}