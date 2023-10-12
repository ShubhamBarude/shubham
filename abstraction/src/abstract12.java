 abstract class abstract12
{
    abstract void add();
    abstract int sub();
    abstract boolean mul();
    abstract long div();
    int a=10;
    int b=20;
}
class abstract012 extends abstract12
{
    @Override
    void add() {
        System.out.println("enter a add:"+(a+b));
    }

    @Override
    int sub() {
        System.out.println("enter a sub:"+(b-a));
        return 0;
    }

    @Override
    boolean mul() {
        System.out.println("enter mul:"+(b*a));
        return false;
    }

    @Override
    long div() {
        System.out.println("enter div:"+(b/a));
        return 0;
    }

    public static void main(String[] args) {
        abstract012 obj=new abstract012();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        System.out.println("enter a a value A:"+obj.a);
        System.out.println("enter a value B:"+obj.b);
    }
}
