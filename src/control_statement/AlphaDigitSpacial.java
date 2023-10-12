package control_statement;

import java.util.Scanner;

public class AlphaDigitSpacial
{
    public static void main(String[] args) {
        System.out.println("enter a char:");
        Scanner sc=new Scanner(System.in);
                char a;
                a=sc.next().charAt(0);
//       char a='f';
//        int b=8;
//        String c="%";

       if (Character.isAlphabetic(a))
        {
            System.out.println("it is char");
        } else if (Character.isDigit(a) ) {
            System.out.println("it is number");
        }
        else {
            System.out.println(("it is spacial char:"));
        }
    }
}
