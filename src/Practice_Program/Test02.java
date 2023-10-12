package Practice_Program;

public class Test02 implements test02 {

    @Override
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("first override method:" + sum);
    }

    public static void main(String[] args) {
        //anonymous
        test02 ref = new test02() {
            @Override
            public void add(int a, int b) {

                System.out.println("second override method:" + (b - a));
            }
        };
        ref.add(20, 60);
        //Lamda expression
        test02 ref2 = (int j, int k) -> {
            System.out.println("third override method;" + (j * k));
        };
        ref2.add(10, 20);
    }
}

interface test02 {
    void add(int a, int b);


}