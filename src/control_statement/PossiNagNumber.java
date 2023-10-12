package control_statement;

import java.util.Scanner;

public class PossiNagNumber
{
    public static void main(String[] args) {
        int num1;
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
         num1=sc.nextInt();

        if(num1>0)
        {
            System.out.println("positive number");
        }
        else if (num1<0){
            System.out.println("negative number");
        }
        else {
            System.out.println("enter a value zero");
        }
    }
}
