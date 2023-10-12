public class multi4 {
    int a = 30;
    int b = 20;
    int c = 14;
}
 class  multi04 extends multi4
 {
    void add()
    {
        System.out.println("enter"+(a+b));
    }
}
class multi004 extends multi04{
    void sub()
    {
        System.out.println("enetr sub:"+(b-a));
    }
}
class multi0004 extends multi004
{
    void mul()
    {
        System.out.println("entr mul:"+(b*c));
    }

    public static void main(String[] args) {
        multi0004 obj=new multi0004();
        obj.add();
        obj.sub();
        obj.mul();
    }
}