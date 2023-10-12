package control_statement;

import java.util.Scanner;

public class BasicSalary
{
    public static void main(String[] args) {
        double basic_salary;
        double HouseRentAllowances;
        double DearnessAllowances;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your basic salary");
        basic_salary=sc.nextDouble();
       // HouseRentAllowances=sc.nextDouble();
       // DearnessAllowances=sc.nextDouble();
        if(basic_salary<=10000)
        {
            HouseRentAllowances=((basic_salary*20)/100);
            DearnessAllowances=((basic_salary*80)/100);
            System.out.println("below 10000 salary it will be :"+(basic_salary+DearnessAllowances+HouseRentAllowances));
        }
        else if(basic_salary<=20000)
        {
            HouseRentAllowances= ((basic_salary*25)/100);
            DearnessAllowances=((basic_salary*90)/100);
            System.out.println("below 20000 salary it will be:"+(basic_salary+DearnessAllowances+HouseRentAllowances));
        }
        else
        {
            HouseRentAllowances= ((basic_salary*30)/100 );
            DearnessAllowances= ((basic_salary*95)/100);
            System.out.println("above 20000 salary it will be:"+(basic_salary+DearnessAllowances+HouseRentAllowances));
        }
    }
}
