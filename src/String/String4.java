package String;

public class String4
{
    public static void main(String[] args) {
        String name="amit";
        String name1="amit1";
        String op1=new String("amit847");
        String op2=new String ("amit132");
        System.out.println(op1==op2);
        System.out.println(op1==name1);
        System.out.println(op1.equals(op2));
        System.out.println(op2.equals(name));
    }
}

