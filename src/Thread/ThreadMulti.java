package Thread;
public class ThreadMulti implements Runnable
{

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("index:" +i+"thread:"+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {

        ThreadMulti obj4=new ThreadMulti();
        Thread obj=new Thread(obj4);
        obj.setName("shubham");
        obj.start();
        Thread obj1=new Thread(obj4);
        obj1. setName("akash");
        obj1.start();
    }

}

