public class unaryop5 {
    int num=10;
    int num1=40;
    public void ak()
    {
        System.out.println("enter a number:"+num);

    }
    public void zk()
    {
        System.out.println("enter a number:"+num1);
    }
    public void bk()
    {

        System.out.println("post increment:"+(+num));
        System.out.println("post increment:"+(num++));
        System.out.println("post increment:"+(num++));
    }
    public void ck()
    {

        System.out.println("post decrement"+num1);
        System.out.println("post increment:"+(num1--));
        System.out.println("post increment:"+(num1--));

    }
    public void dk()
    {
        ++num;
        System.out.println("pre increment:"+num);
    }
    public void ek()
    {
        --num1;
        System.out.println("pre decrement:"+num1);
    }
    public static void main (String args[])
    {
        unaryop5 obj=new unaryop5();
        obj.ak();
        obj.zk();
        obj.bk();
        obj.ck();
        obj.dk();
        obj.ek();
            }
}
