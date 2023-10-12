package Practice_Program;

public class  RevString
{
    public static void main(String[] args) {
        String name="shubham";
        String rev="";
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            rev=ch+rev;
        }
        System.out.println("enter a rev String:"+rev);
    }

}

