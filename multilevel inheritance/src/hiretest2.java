public class hiretest2 {
    String a = "shubham";
    char b = 'k';
    boolean c = true;
    int d = 90;
    long e = 10;

    public void ak() {
        System.out.println("enter a string value" + a);
    }
}

class hiretest02 extends hiretest2 {
    public void bk() {
        System.out.println("enter char value " + b);
    }
}

class hiretest002 extends hiretest2 {
    public void add() {
        long f = d + e;
        System.out.println("add" + f);
    }
}

class hiretest0002 extends hiretest02 {
    public void sub() {
        long g = d - e;
        System.out.println("sub" + g);
    }
}

class hiretest00002 extends hiretest02
{
    public int mul()
    {
        long h = d * e;
        System.out.println("enter" + h);
         return 10;
    }

    public static void main(String[] args)
    {
        hiretest00002 obj = new hiretest00002();
        obj.bk();
        obj.ak();
        obj.mul();

        hiretest002 obj1 = new hiretest002();
        obj1.add();
        hiretest0002 obj2 = new hiretest0002();
        obj2.sub();
    }
}

