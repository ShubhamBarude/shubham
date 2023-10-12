public class test08 {
    public short zk()
    {
        System.out.println();
        return 98;
    }
    public long lk()
    {
        System.out.println();
        return 78965;
    }
    public boolean pk()
    {
        System.out.println();
        return true;
    }
    public char ak()
    {
        System.out.println();
        return 'l';
    }
    public String mk()
    {
        System.out.println();
        return"ouytrew";
    }
}
class test8 extends test08{
    public static void main(String args[])
    {
        test8 qk=new test8();
        qk.ak();
        qk.zk();
        qk.lk();
        qk.mk();
        qk.pk();
        System.out.println("enetr a char"+qk.ak());
        System.out.println("enetr a short"+qk.zk());
        System.out.println("enetr a long"+qk.lk());
        System.out.println("enetr a string"+qk.mk());
        System.out.println("enetr a boolean"+qk.pk());
    }
}