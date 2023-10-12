package Thread;

public class ThreadTest03
{
    void add()
    {
        System.out.println("it is add method:");
    }

}
class ThreadTest003 extends ThreadTest03 implements Runnable
{

    @Override
    public void run() {

        System.out.println("it is run method:");
    }

    public static void main(String[] args) {
        ThreadTest003 obj=new ThreadTest003();
        obj.add();
        Thread obj1=new Thread(obj);
        obj1.start();
      //  obj1.start();
        System.out.println("it is main method:");
    }
}