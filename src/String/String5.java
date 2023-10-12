package String;

public class String5
{
    public static void main(String[] args) {
        String name="vision";
        String name1="shubham";
        String op1=new String("shubham");
        String op2=new String ("vision");
        System.out.println(op1==op2);
        System.out.println(op1==name1);
        System.out.println(op1.equals(op2));
        System.out.println(op2.equals(name));
    }
}


