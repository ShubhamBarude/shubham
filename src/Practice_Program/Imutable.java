package Practice_Program;

 final class Imutable
{
    private final int a=10;
    private final int b=14;

    public int getA() {

        System.out.println("enetr a value a:"+a);
        return a;
    }

    public int getB() {
        System.out.println("enter a b value:"+b);
        return b;
    }
    Imutable(int a,int b)
    {
        System.out.println("enter a constructor");
    }

    public static void main(String[] args) {
        Imutable obj=new Imutable(10,12);
        obj.getA();
        obj.getB();
    }
}
