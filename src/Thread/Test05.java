package Thread;

public class Test05 extends Thread {

//    private void printRecords(){
//        synchronized(this){
//            for (int i = 0; i <= 5; i++) {
//                System.out.println("print a index:" + i + "printing thread name:" + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(100);
//               } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//
//    }

    @Override
    public synchronized void run() {

        for (int i = 0; i <=5; i++) {
            System.out.println("print a index:" + i + "printing thread name:" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Test05 obj = new Test05();
        Thread ref=new Thread(obj);
        ref.setName("akash");
        ref.start();
       // Test05 obj1 = new Test05();
        Thread ref1=new Thread(obj);
        ref1.setName("shubham");
        ref1.start();
    }
}
