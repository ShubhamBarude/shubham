package Thread;

public class Test04 extends Thread
{
    @Override
    public void run() {
        System.out.println("it is run method:");
        super.run();
    }

    public static void main(String[] args)
    {
        Test04 obj1=new Test04();

               Thread obj = new Thread();
               Thread t2=new Thread();
        System.out.println("Current thread is " +obj);
        System.out.println("Name of current thread is: " +t2.getName());
        t2.setName("shubham");
        System.out.println("new thread name:"+t2);
        System.out.println("get priority:"+t2.getPriority());
        t2.setPriority(10);
        System.out.println("set priority:"+t2);
       // System.out.println("print exception type:"+10/0);

        System.out.println("name of current thread name:"+t2.getName());
       // t2.yield();
        System.out.println("Name of current thread after changing name is " +t2);
        System.out.println("current thread name for checking "+Thread.currentThread().getName());
        System.out.println("current thread condition:"+currentThread().isAlive());

        obj1.start();

    }


}