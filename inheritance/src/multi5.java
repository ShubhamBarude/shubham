public class multi5 {
    String name="shubham";
    String city="pune";
    String location="warje";
}
class multi05 extends multi5
{
    int ak()
    {
        System.out.println("enetr your name:"+name);
        return 20;
    }
}
class multi005 extends multi05{
    String city()
    {
        System.out.println("enetr your city "+city);
        return "dfff";
    }
}
class multi0005 extends multi005{
    void location()
    {
        System.out.println("enetr your location:"+location);
    }

    public static void main(String[] args) {
        multi0005 obj=new multi0005();
        obj.ak();
        obj.city();
        obj.location();
    }
}