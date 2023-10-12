public class hybtest3 {

    int z=10;
    char b='l';

    boolean d=true;
    String k="latur";
    public void add(int a)
    {
        long y=a+z;
        System.out.println("add"+y);
    }
}
class hybtest03 extends hybtest3
{
    public void ak()
    {
        System.out.println("print char"+b);
    }
}
class hybtest003 extends hybtest3
{
    public int sub(int a,int c) {
        int x = a - c;
        System.out.println("sub" + x);
        return 10;
    }
}
class hybtest0003 extends hybtest03 {
    public String value() {
        System.out.println("enter boolean value" + d);
        return "sh";
    }

}
class hybtest00003 extends hybtest003 {
    public char mk()
    {
        System.out.println("enter a value string"+k);
        return'r';
}

    public static void main(String args[])
    {
        hybtest0003 obj=new hybtest0003();
        obj.add(40);
        obj.value();
        obj.ak();
        hybtest003 obj1=new hybtest003();
        obj1.sub(20,10);
        hybtest00003 obj2=new hybtest00003();
        obj2.mk();


    }

}