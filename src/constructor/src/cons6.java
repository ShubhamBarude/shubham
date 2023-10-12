public class cons6
{
    cons6()
    {
        System.out.println("enetr a first class default cons");
    }
    cons6(String a)
    {
        System.out.println("enetr a first class para cons");
    }
}
class cons06 extends cons6
{
    cons06()
    {
        System.out.println("enetr a second class default cons");
    }
    cons06(int a,int b)
    {
        System.out.println("enetr a second class para cons");
    }
}
class cons006 extends cons06
{
    cons006()
    {
        System.out.println("enetr a third class default cons");
    }
    cons006(boolean a)
    {
        System.out.println("enetr a third para cons");
    }

    public static void main(String[] args) {
        cons006 obj=new cons006();
    }
}