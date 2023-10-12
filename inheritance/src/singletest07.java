public class singletest07
{
    String a="sun";
    String b="mon";
    String c="tue";
    void day()
    {
        System.out.println("enetr value :"+a);
    }
    void day1()
    {
        System.out.println("enetr value :"+b);
    }
}
class singletest007 extends singletest07
{
    void day2()
    {
        System.out.println("enetr a value :"+c);
    }

    public static void main(String[] args) {
        singletest007 obj=new singletest007();
        obj.day();
        obj.day1();
        obj.day2();
    }
}