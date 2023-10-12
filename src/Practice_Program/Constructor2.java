package Practice_Program;

public class Constructor2
{
     int a;
     int b;
     int c;
     int d;

    public Constructor2(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Constructor2{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';

    }

    public static void main(String[] args) {
        Constructor2 obj=new Constructor2(10,20,30,50);
    }
}
