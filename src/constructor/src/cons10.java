public class cons10
{
    private int a;
    private int b;
    private int c;

    public cons10(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("enetr a add:"+(a+b+c));
    }

    @Override
    public String toString() {
        return "cons10{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        cons10 obj=new cons10(10,20,30);
    }
}
