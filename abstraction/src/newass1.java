public class newass1 {
    public void ak(int a,int b)
    {
        System.out.println("enetr a first method:"+a+ " "+b);
    }
    int bk(String name,String city)
    {
        System.out.println("enetr a second method:"+name+ " "+city);
        return 10;
    }
    String ck(byte y, byte z)
    {
        System.out.println("enter a third  method:"+y+ " "+z);
        return "aklsd";
    }

    public static void main(String[] args) {
        newass1 obj=new newass1();
        newass1 obj2=new newass1();
        newass1 obj3=new newass1();
        obj.ak(10,15);
        obj.bk("shubham","latur");
        obj.ck((byte)10,(byte)36);
        obj2.ak(12,13);
        obj2.bk("shubham","pune");
        obj2.ck((byte)20,(byte)10);
        obj3.ak(21,47);
        obj3.bk("latur ","udgir");
        obj3.ck((byte)17,(byte)32);
    }
}
