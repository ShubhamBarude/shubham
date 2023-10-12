public class test09 {
    public int hk( int a,int b)
    {
        System.out.println();
        return a+b;
    }
    public void ak(String a) {
        System.out.println("enter"+a);
       // return 10;
    }
    public short bk()
    {
        System.out.println();
                return 98;
    }
    public long sk(short a,short b)
    {
        System.out.println();
        return 30;
    }
    public boolean mk()
    {
        System.out.println();
        return true;
    }
    public char nk()
    {
        System.out.println();
        return 'h';
    }
    public int jk(byte a,byte b)
    {
        System.out.println();
        return 60;
    }
}
class test9 extends test09{
    public static void main(String args[])
    {
        test9 zk=new test9();
        zk.hk(40,50);
      zk.ak("shubham");
        zk.bk();
        zk.sk((short)60,(short)30);
        zk.mk();
        zk.jk((byte) 30,(byte)10);
        System.out.println("enter a value"+zk.hk(12,12));
       // System.out.println("enter a value"+ zk.ak("akash"));
        System.out.println("enter a value"+zk.bk());
        System.out.println("enter a value"+zk.sk((short)30,(short)20));
        System.out.println("enter a value"+zk.jk((byte)30,(byte)10));
        System.out.println("   "+zk.mk());
        System.out.println("   "+zk.nk());



    }
}