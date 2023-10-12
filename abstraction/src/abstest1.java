import java.util.*;
abstract class abstest1
{
   abstract   long username();
    abstract int password();
   abstract  String login();
}
 class abs01test  extends abstest1
{

    protected long username() {
        System.out.println("shubham");

        return 0;
    }

    int password() {
       System.out.println("enter a password");
        return 0;
    }


    String login() {
       System.out.println("click on login");
        return null;
    }
    public static void main (String args[])
    {
        abs01test obj=new abs01test();
        obj.login();
        obj.password();
        obj.username();


      // System.out.println("enter a username : ");



      //  System.out.println("enter a password : ");


       // System.out.println("enter a click login: ");


    }


}

