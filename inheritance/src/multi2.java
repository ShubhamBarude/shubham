public class multi2
{
    String name="shubham";
    String city="latur";
    int id =30;
}
class multi02 extends multi2
{
 void name()
 {
     System.out.println("enetr your name:"+name);
 }
}
class multi002 extends multi02
{
   void city()
   {
       System.out.println("enetr a city name:"+city);
   }
}
class multi0002 extends multi002
{
    void id ()
    {
        System.out.println("enetr your id :"+id);
    }

    public static void main(String[] args) {
        multi0002 obj=new multi0002();
        obj.name();
        obj.city();
        obj.id();
    }
}