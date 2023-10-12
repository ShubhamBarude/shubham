package package2;



import java.util.*;

class CustomExp extends RuntimeException{
    CustomExp(String msg){
        super(msg);
    }


}
 public class UserDefine{
    public static void main (String args[]){
        int age=30;
        try{
            if(age>=18){
                throw new CustomExp("it is applicable for votting:");

            }
            else{
                System.out.println("it is not applicable for votting");
            }

        }

        catch(CustomExp e){
            System.out.println("it is catch block");
            e.printStackTrace();
        }
        System.out.println("it is last statement");
    }
}