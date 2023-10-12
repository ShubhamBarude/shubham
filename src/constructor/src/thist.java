public class thist {
    int a;
    public void ak(int a)
    {

       this.a=a;
    }
    public int bk()
    {

        System.out.println("enter a value:"+a);
        return 23;
    }
    public static void main(String args[])
    {
        thist obj=new thist();
        obj.ak(20);
        obj.bk();

    }
}
