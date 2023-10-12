package Practice_Program;

public class imutable01
{
    public static void main(String[] args) {
        test obj=new test(40,50);
        obj.getA();
        obj.getB();
    }

}
final class test
{
    private final int a=30;
    private final int b=10;

    public int getA() {
        System.out.println("it is first get method :");
        return a;
    }

    public int getB() {
        System.out.println("it is second get method:");
        return b;
    }
    test(int a,int b){
        System.out.println("enter a parametric constructor:");

    }

}