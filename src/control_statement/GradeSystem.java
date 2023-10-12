package control_statement;

import java.util.Scanner;

public class GradeSystem
{
    public static void main(String[] args) {
        int phy,chem,bio,math,comp,Total;

        int sub;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a your subject :");
        sub =sc.nextInt();
        System.out.println("enter a Physics subject marks:");
        phy=sc.nextInt();
        System.out.println("enetr a Chemistry subject marks");
        chem=sc.nextInt();
        System.out.println("enter a Biology subject marks:");
        bio=sc.nextInt();
        System.out.println("enter a Mathematics subject marks;");
        math=sc.nextInt();
        System.out.println("enter a Computer subject marks:");
        comp=sc.nextInt();
        Total=phy+chem+bio+math+comp;
//double per=(Total/500)*100;
      int avg=(Total*100)/500;
        if(avg>=90)
        {
            System.out.println("A grade");
        }
        else if(avg >=80)
        {
            System.out.println("B grade");
        }
        else if(avg>=70)
        {
            System.out.println(" C grade");
        }
        else if(avg>=60)
        {
            System.out.println("D grade");
        }
        else if(avg>=40)
        {
            System.out.println("E grade");
        }
        else
        {
            System.out.println("your are fail");
        }

    }
}
