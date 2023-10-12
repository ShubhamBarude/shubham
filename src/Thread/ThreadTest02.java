package Thread;

public class ThreadTest02
{
    public static void main(String[] args) {
        ThreadTest002 obj=new ThreadTest002();
        ThreadTest002 obj1=new ThreadTest002();
        obj1.start();
        obj.start();
    }
}
class ThreadTest002 extends Thread
{
    @Override
    public void run() {
        super.run();
        System.out.println("it is run method:");

    }

}
