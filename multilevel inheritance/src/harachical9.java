public class harachical9 {
    int id=20;
    String name;
    char a='s';
}
class harachical09 extends harachical9
{
    void id()
    {
        System.out.println("enetr a id :"+id);
    }
}
class harachical009 extends harachical9
{
    void name(String name)
    {
        System.out.println("enetr your name:"+name);
    }
}
class harachical0009 extends harachical9
{
    void chara()
    {
        System.out.println("enetr your value:"+a);
    }

    public static void main(String[] args) {
        harachical0009 obj=new harachical0009();
        harachical009 obj1=new harachical009();
        harachical09 obj2=new harachical09();
        obj.chara();
        obj1.name("shubham");
        obj2.id();
    }
}