package package2;

public class xyz extends add
{
    int a=1;
    static int b=5;
    xyz(){
        a++;
        b++;
        System.out.println("enetr value a not static:"+a);
        System.out.println("enetr  value b static:"+b);
    }

    public static void main(String[] args) {
        xyz obj=new xyz();
        obj.add();
        obj.div();
        obj.mul();

    }
}
