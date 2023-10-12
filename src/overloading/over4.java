package overloading;

public class over4
{
    int show(int a,boolean b)
    {
        System.out.println("start with key");
        return 20;
    }
    int show(boolean c,double a)
    {
        System.out.println("start with kick");
        return 41;
    }
    double show() {
        System.out.println("enetr bike name:");
        return 45.23;
    }

    public static void main(String[] args) {
        over4 obj=new over4();
        obj.show();
        obj.show(20,true );
        obj.show(false,42.12);

    }


}
