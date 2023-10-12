public class overloading
{
    void ak(int a,String b)
    {
        System.out.println("1");
    }
    void ak(String a,int b)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        overloading obj=new overloading();
        obj.ak("ak",30);
    }
}
