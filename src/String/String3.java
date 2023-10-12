package String;

public class String3
{
    public static void main(String[] args) {
        String name="saurab";
        String name1="saurab1";
        String obj=new String("saurab");
        String obj1=new String("saurab123");
        System.out.println(obj==name1);
        System.out.println(obj1.equals(name1));
        System.out.println(obj==name);
        System.out.println(obj.equals(name));
    }
}
