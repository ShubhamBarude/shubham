public class newassi2
{
    void fun(int a,int b)
    {
        System.out.println("enter a first method:"+a+" "+b);
    }
    int fun1(short a,short b)
    {
        System.out.println("enetr a second method:"+a+" "+b);
        return 10;
    }
        char fun2(boolean a,boolean b)
        {
            System.out.println("enetr a third method:"+a+ " "+b);
            return'd';
        }

    public static void main(String[] args) {
        newassi2 obj=new newassi2();
        newassi2 obj1=new newassi2();
        newassi2 obj2=new newassi2();
        obj.fun(10,20);
        obj.fun1((short)56,(short)36);
        obj.fun2(true,false);
        obj1.fun(40,20);
        obj1.fun2(true ,false);
        obj1.fun1((short)60,(short)30);
        obj2.fun1((short)52,(short)14);
        obj2.fun(30,45);
        obj2.fun2(false,true);
    }
}
