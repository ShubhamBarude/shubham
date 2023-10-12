package Thread;

public class Test01 extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("print index:"+i+" thread name"+Thread.currentThread().getName());
        }

      //  System.out.println("it is first method:");
    }
    public static void main(String[] args) {
        Test01 ref=new Test01();
        Thread obj=new Thread(ref);
        Thread obj1=new Thread(ref);
        obj.setName("java");
        obj1.setName("vision");
        obj.start();
        obj1.start();
      //  obj.notify();
        //obj.setPriority(20);
//        try {
//            obj.sleep(1000);
//        } catch (InterruptedException e) {
//         //   throw new RuntimeException(e);
//        }
//        try {
//            obj.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("it is second method:");
//        try {
//            obj.wait(1000);
//        } catch (InterruptedException e) {
//         //   throw new RuntimeException(e);
//        }
    }
//    @Override
//    public void run() {
//
//        System.out.println("it is first method:");
//    }
}
