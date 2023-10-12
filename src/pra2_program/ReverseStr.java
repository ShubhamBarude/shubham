package pra2_program;

public class ReverseStr {
    public static void main(String[] args) {
        String ref="deepak";
        String rev="";
        for(int i=0;i<ref.length();i++)
        {
            char ch=ref.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
