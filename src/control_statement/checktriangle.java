package control_statement;

import java.util.Scanner;

public class checktriangle
{
    public static void main(String[] args) {
        int side1,side2,side3;
        System.out.println("enter a three side:");
        Scanner sc=new Scanner(System.in);
        side1=sc.nextInt();
        side2=sc.nextInt();
        side3=sc.nextInt();
        if(side1==side2 && side2==side3)
        {
            System.out.println("it is equlitral triangle");
        }
        else if(side1==side2 ||  side2==side1 || side3!=side1)
        {
            System.out.println("isosceles triangle");
        }
        else
        {
            System.out.println("sealene triangle");
       }
    }
}
