package Practice_Program;
interface shubham{
    void add();
}
public class JavaSam implements  shubham{

    @Override
    public void add() {
        System.out.println("it is first method:");
    }

    public static void main(String[] args) {
        JavaSam ok=new JavaSam();
        ok.add();
    }
}
