package Practice_Program;

public class ExceptionHandling
{
    int a=20;
    int b=30;
    void add(){
        int z=b/0;
        System.out.println("you can't divide :"+z);
    }

    public static void main(String[] args) {
        ExceptionHandling obj=new ExceptionHandling();
        try{                                    //it is used for to write a exception code
       obj.add();//ArithmeticException
    }
        catch (ArithmeticException o) {                //it is used for catch exception
            System.out.println("you are dividing by 0");
        }
        }
}
//=======================================================================================================================
class throws_throw {
    int a=20;
    int b=30;
    void add() throws NullPointerException{//when we call add method in any class it will generated null pointer
                                           //exception because we are not handle exception we are throws exception
        throws_throw ref=null;
        System.out.println(ref.a);
    }

    public static void main(String[] args) {
        throws_throw ref1=new throws_throw();
            ref1.add();
    }
}

class exception01{
    public static void main(String[] args) {
        throws_throw obj=new throws_throw();
        obj.add();
    }
}
//======================================================================================================================
class AkashNotFoundException extends RuntimeException{
    AkashNotFoundException(String msg) // throw message will come in msg and print when condition will false
    {
        super(msg);
    }

}
class exp {

    public static void main(String[] args) {
        int age=20;
        try {
            if (age > 18) {
                System.out.println("yor are eligible for vote:");
                throw new AkashNotFoundException("akash found in coffee shop with ....");
                //throw is send message to akashnotfoundexception
            } else {
                System.out.println("your are not eligible for vote:");

            }
        }
        catch(AkashNotFoundException o){
            System.out.println("it is catch block:");
            o.printStackTrace();
        }
    }
}