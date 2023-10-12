//Threads can be created by using two mechanisms :

//Extending the Thread class
//Implementing the Runnable Interface
//======================================================
//when we are extends a thread class, so we can't extends any other class in future or now
//but java is not support to multiple inheritance so,it that case we want implement runable interface
//====================================================================================================
//when we extends thread class so,we can achieve some basic functionally of thread class
//like a in thread class available some method ex:yield(), interrupted()


package Thread;

public class MultithreadingTest1 extends Thread{

    @Override
    public void run() {

        System.out.println("thread="+Thread.currentThread().getId()+"thread is running ");
        super.run();
    }

    public static void main(String[] args) {
        MultithreadingTest1 obj=new MultithreadingTest1();
obj.start();
    }
}
