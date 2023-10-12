public class test1
{
    int g=59;
    short w=  11;
    public byte  d( short j)
    {
        System.out.println( " value:"+j);
        return 23;


    }
    public static void main (String args[])
    {
        test1 kp=new test1();
        kp.d((short)111);
        System.out.println("enter a value:"+kp.w);
    }
}

