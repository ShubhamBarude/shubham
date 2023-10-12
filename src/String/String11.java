package String;

public class String11
{
    public static void main(String[] args) {
        String name="saurab";
        String name1="akash";
        String name2="angad";
        String name3="vijay";
        String obj=new String("tdit");
        String obj1=new String("vision");
        String obj2=new String("akash");
        String obj3=new String("saurab");
        String obj4=new String("vijay");
        name=name.concat("shubham");
        System.out.println(name==name3);//false
        System.out.println(name.equals(name3));//false
        System.out.println(name1==obj4);//false
        System.out.println(obj.equals(obj1));//false
        System.out.println(name2==obj2);//false
        System.out.println(name3.equals(obj3));////false
        System.out.println(name);//shubham============saurabshubham
    }

}
