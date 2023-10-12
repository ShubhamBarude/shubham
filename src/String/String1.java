package String;



public class String1
{
    public static void main(String[] args) {
        String name="shubham"; //litral object
        String name1="shubham";
        String op1=new String("shubham123");
        String op2=new String ("shubham123");
        String op3=new String ("shubham123");
        System.out.println(name==name1);// == this is use for checking memory location
        System.out.println(op1==op2);
        System.out.println(op1==name1);
        System.out.println(op1.equals(op2));// this method is checks contains
        System.out.println(op2.equals(name));

    }
}

