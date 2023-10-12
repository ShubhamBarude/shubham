package overloading;

public class over5 {
    void add()
    {
        System.out.println("enetr your name:");
    }
    int add(int a,boolean b)
    {
        System.out.println("enetr method 1A:"+a+" "+b);
        return 10;
    }
    double add(boolean a,float b)
    {
        System.out.println("enter method 1B:"+a+" "+b);
        return 2.03;
    }
    float sub(byte a)
    {
        System.out.println("enetr method 1C:"+a);
        return 2.31f;
    }
    int sub()
    {
        System.out.println("enetr method 2A");
        return 10;
    }
        boolean sub(int a)
        {
            System.out.println("enetr method 2B");
            return true;
        }
        float sub(byte a ,short m)
        {
            System.out.println("enetr method 2C");
            return 0.14f;
        }

    public static void main(String[] args) {
        over5 obj=new over5();
        obj.add();
        obj.add(10,true);
        obj.add(false,0.14f);
        obj.sub();
        obj.sub((byte)20);
        obj.sub(78);
        obj.sub((byte)10,(short)20);
    }
}
