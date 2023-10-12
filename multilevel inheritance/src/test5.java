public class test5 {
    int a = 30;
    long b = 10;

    public void ak() {
        long c = a + b;
        System.out.println("eneter add" + c);
    }
}

class test05 extends test5 {
    public int bk() {
        long d = a - b;
        System.out.println("sub " + d);
        return 12;
    }
}
        class test005 extends test05{
    public void ck()
    {
        long e=a*b;
        System.out.println("enter mul "+e);
    }
    public static void main(String args[])
    {
        test005 zk=new test005();
        zk.ak();
        zk.bk();
        zk.ck();

    }
        }

