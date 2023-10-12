package Practice_Program;

public class ImutableClass
{
    public static void main(String[] args) {
        test1 obj=new test1(10,30);
        System.out.println(obj.getA());
        System.out.println(obj.getB());

    }
}
final class test1{
    private int a;
    private int b;

    public test1(int a, int b) {

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}