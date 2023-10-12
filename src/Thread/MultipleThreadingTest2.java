//when we implements runable interface we can extend any other base class
//by using runable interface,we want to create thread class object that object can share to multiple threads
//by using runable interface we can't use thread class functionality like a method
//but most of the people preferred to runable interface
//but it is also know the important note:we can't use runable without thread class


package Thread;

public class MultipleThreadingTest2 implements Runnable
{

    @Override
    public void run() {
        System.out.println("it is run method :");
    }

    public static void main(String[] args) {
        MultipleThreadingTest2 obj=new MultipleThreadingTest2();
        Thread ref=new Thread(obj);
        ref.start();
    }
}
