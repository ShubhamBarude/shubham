public class test07 {
    public boolean lk()
    {
        System.out.println();
        return false;
    }
    public byte mk()
    {
        System.out.println();
        return 65;
    }
}
class test7 extends test07{
    public static void main(String args[])
    {
        test7 ok=new test7();
        ok.lk();
        ok.mk();
        System.out.println("enetr boolean value1"+ok.lk());
        System.out.println("enetr a value of byte 2 "+ok.mk());
    }
}