package Thread;

public class ThreadMulti01 extends Thread
{
    @Override
    public void run() {
        for(int i=1;i<5;i++)
        {
            System.out.println("index value:"+i+"thread:"+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        ThreadMulti01 obj1=new ThreadMulti01();
        Thread obj=new Thread(obj1);
        Thread obj2=new Thread(obj1);
        obj.setName("latur");
        obj.start();
        obj2.setName("pune");
        obj2.start();
    }
}
