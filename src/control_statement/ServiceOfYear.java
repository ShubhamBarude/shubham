package control_statement;

import java.util.Scanner;

public class ServiceOfYear
{
    public static void main(String[] args) {
        int num_of_exp;
        String degree;
        String gender;
        Scanner sc=new Scanner(System.in);
        System.out.println("number of expireance:");
        num_of_exp =sc.nextInt();
        System.out.println("enter your degree qualification");
        degree=sc.next();
        System.out.println("enter your gender:");
        gender=sc.next();
        if (num_of_exp>=10 && degree.equals("PG") && gender.equals("male"))
        {
            System.out.println("your salary is 15000");
        }

        else if (num_of_exp>=10 && degree.equals("G") && gender.equals("male"))

        {
            System.out.println("your salary is 10000");
        }
        else if(num_of_exp<10 && degree.equals("PG") && gender.equals("male"))
        {
            System.out.println("your salary is 10000");
        }
        else if(num_of_exp<10 && degree.equals("G") && gender.equals("male"))
        {
            System.out.println("your salary is 7000");
        }
        else if(num_of_exp>=10 && degree.equals("PG") && gender.equals("female"))
        {
            System.out.println("your salary is 12000");
        }
        else if(num_of_exp>=10 && degree.equals("G") && gender.equals("female"))
        {
            System.out.println("your salary is 9000");
        } else if (num_of_exp<10 && degree.equals("PG") && gender.equals("female")) {
            System.out.println("your salary is 10000");
        }
        else
        {
            System.out.println("your salary is 6000 ");
        }
    }
}
