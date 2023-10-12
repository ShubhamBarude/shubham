package Thread;
interface inter04
{
 void add();
 static void sub (){
     System.out.println("it is static method:");
 }
 default void mul(){
     System.out.println("it default method:");
 }
}
public class ThreadTest04 implements inter04
{

    @Override
    public void add() {
        System.out.println("it is add method:");
    }

    public static void main(String[] args) {
        ThreadTest04 obj=new ThreadTest04();
        obj.add();
        inter04 .sub();
        obj.mul();
    }
}
