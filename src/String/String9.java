package String;

public class String9
{
    public static void main(String[] args) {
        String name="shubham";
        String name1="shubham1";
        String s2=new String("java");
        String s1="java";
        String s=new String("java");

        String op1=new String("shubham000");
        String op2=new String ("shubham654");
        System.out.println(op1==op2);
        System.out.println(op1==name1);
        System.out.println(op1.equals(op2));
        System.out.println(op2.equals(name));
        System.out.println(s2==s1);//false
        System.out.println(s.equals(s1));//true
    }
}

