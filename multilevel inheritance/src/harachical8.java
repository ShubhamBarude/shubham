public class harachical8 {
    String name="shubham";
    String city="pune";
    String class_name="vision";
}
class harachical08 extends harachical8
{
    void name()
    {
        System.out.println("enetr your name:"+name);
    }
}
class harachical008 extends harachical8
{
    void city()
    {
        System.out.println("enetr your city:"+city);
    }
}
class harachical0008 extends harachical8
{
    void class_name()
    {
        System.out.println("enetr your class_name:"+class_name);
    }

    public static void main(String[] args) {
        harachical0008 obj=new harachical0008();
        harachical008 obj1=new harachical008();
        harachical08 obj2=new harachical08();
        obj1.city();
        obj2.name();
        obj.class_name();

    }
}
