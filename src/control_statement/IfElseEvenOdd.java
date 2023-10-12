package control_statement;

import java.util.*;
public class IfElseEvenOdd
{
   int num;
    public static void main(String[] args) {
//int num=65;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr your number:");
        int num=sc.nextInt();
        if(num%2!=0)
        {
            System.out.println(" odd number:");

        }
        else
        {
            System.out.println("even number:");
        }
    }
}
