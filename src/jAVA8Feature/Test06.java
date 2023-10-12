package jAVA8Feature;
interface inter06
{
    void add(int a,int b,int c);
}

public class Test06 implements inter06 {

    @Override
    public void add(int a, int b, int c) {
        System.out.println("enter a add:" + (a + b));
    }

    public static void main(String[] args) {
        Test06 obj1 = new Test06();
        obj1.add(30, 20, 60);

        //Anonymous class
        inter06 obj2 = new inter06() {

            @Override
            public void add(int a, int b, int c) {
                System.out.println("it is anonymous class:" + (b - c));
            }
        };obj2.add(10,60,20);
        // lambda expression
        inter06 obj3=(int a,int b,int c) -> {
            System.out.println("it is lambda expression:"+(c*b));
        };obj3.add(10,30,30);
    }
}