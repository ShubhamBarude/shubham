package package2;

final class StringImutableTest{
    private final int a;
    private final int b;
    public StringImutableTest(int a,int b){
      this.a=10;
      this.b=20;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
public class StringImutableTest2{
    public static void main(String[] args) {


        StringImutableTest obj = new StringImutableTest(10, 20);

        obj.getA();
obj.getB();

    }

}