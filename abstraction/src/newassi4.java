public class newassi4
{
    public void fun(int a,int b)
    {
        System.out.println("enetr a first method:"+a+" "+b);
    }
    void fun1(String a)
    {
        System.out.println("enetr a second method "+a);
    }
    void fun2(char a)
    {
        System.out.println("enetr a third method:"+a);
    }

    public static void main(String[] args) {
        newassi4 obj=new newassi4();
        newassi4 obj1=new newassi4();
        newassi4 obj2=new newassi4();
        obj.fun(60,89);
        obj.fun1("akash");
        obj.fun2('a');
        obj1.fun1("shubham");
        obj1.fun(30,65);
        obj1.fun2('p');
        obj2.fun2('s');
        obj2.fun(50,30);
        obj2.fun1("pune");
    }
}
