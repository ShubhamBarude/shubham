package Practice_Program;

public class Test01 implements Test001
{

    @Override
    public void add() {
        System.out.println("it is first method to override:");
    }

    public static void main(String[] args) {
        Test01 obj = new Test01();
        obj.add();
        //  Annonymns class
        Test001 ref = new Test001() {
            @Override
            public void add() {
                System.out.println("annonyms class:");
            }
        };
        ref.add();
        //Lamda expression
        Test001 ref2=()-> {
            System.out.println("Lamda expression");
        };
        ref2.add();
    }

}
@FunctionalInterface
interface Test001 {
    void add();
}