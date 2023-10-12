package String;

public class stringmethod1
{
    public static void main(String[] args) {
        String name="java";
        String reverse="";

        for(int i=0; i<name.length();i++)
        {

            char ch=name.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }

}
