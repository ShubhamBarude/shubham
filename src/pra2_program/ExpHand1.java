package pra2_program;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExpHand1 {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result=a/b;
        System.out.println("!!try!!..i am for your any exception code you put in my block:"+result);
        }
        catch (ArithmeticException e){
            System.out.println("!!catch!!..we can't divide by 0 any number:i am for handle exception or give meaningful message to user");
        }
        finally {
            System.out.println("!!finally!!..always execute in any case exception occur or not....i am for close a resources file");
        }
    }
}
class ExpHand2 {
//    void m1(){
//        ExpHand2 ref=new ExpHand2();
//        ref.m2();
//    }
//void m2(){
//    ExpHand2 ref=new ExpHand2();
//    ref.m1(); in this m1 and m2 methods are calling each other there is no end .
//}
//    int a = 30;
//    int b = 20;
//
//    void add() {
//        System.out.println("add:" + (a + b));
//    }
    //=============================================================================================
//    void div()throws ArithmeticException{
//        int a=10;
//        int  b=0;
//        System.out.println("Arithmetic exception:"+a/b);
//
//    }

    public static void main(String[] args) {
//        ExpHand2 obj1 = null;
//        obj1.add();
//==============================================================================================
//        try {
//            FileReader ref = new FileReader("/c/shubham/java");
//        } catch (FileNotFoundException e) {
//            System.out.println("file not found exception:");
//            e.printStackTrace();
//        }
//===============================================================================================
//        try{
//        ExpHand2 obj1=null;
//        obj1.add();
//
//           }
//        catch(NullPointerException e){
//            System.out.println("it is null pointer exception");
//            e.printStackTrace();
//        }
  //      =====================================================================================================
//        try {
//
//            FileWriter obj3=new FileWriter("show.txt1");//in this object we are create a text file
//            try{
//                obj3.write("TDIT class");//we are write a message by using write method
//            }
//            finally {
//                obj3.close();//it is used for close resource it means
        //without this method when program will run then check that text file there is no message is seen bcz
        //that file is open when you close that file and run it will see message which is already written
//                System.out.println("it is finally block:");
//            }
//        }
//        catch(IOException e)
//        {
//
//            System.out.println("file not found:");
//
//        }
        //=========================================================================================================
//        ExpHand2 ref2=new ExpHand2();//it is stack overflow error
//        ref2.m1();
//        ref2.m2();
        //==============================================================================================
//        ExpHand2 ref2=new ExpHand2();
//        ref2.div();//it is throws arithmetic exception
        //throw is used for the custom exception
        //====================================================================

    }
}
