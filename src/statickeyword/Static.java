package statickeyword;

public class Static {
    int a=5;
    static int b=5;
    void add()
    {
       int result =a+b;
        System.out.println(b);
    }
    final static int c=5;

    public static void main(String[]args) {
        Static sd2 = new Static();
        System.out.println("non static>>"+sd2.c);
        System.out.println("non static>>"+sd2.a++);
       // System.out.println(sd2.a);
        System.out.println("static>>"+sd2.b++);
        Static sd3 = new Static();
        System.out.println("non static>>"+sd3.a++);
        System.out.println("static>>"+sd3.b++);
        Static sd4 = new Static();
        System.out.println("non static>>"+sd4.a++);
        System.out.println("static>>"+sd4.b++);
        Static sd5 = new Static();
        System.out.println("non static>>"+sd5.a++);
        System.out.println("static>>"+sd5.b++);

    }

}
