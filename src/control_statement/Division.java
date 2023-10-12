package control_statement;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int marathi;
        int english;
        int math;
        int phy;
        int bio;
        int num;
        double per;


        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no of subject:");
        num = sc.nextInt();


        System.out.println("enter your marathi subject marks");
        marathi=sc.nextInt();

        System.out.println("enter your english subject:");
        english=sc.nextInt();

        System.out.println("enter your math subject:");
        math=sc.nextInt();

        System.out.println("enter your phy subject:");
        phy=sc.nextInt();

        System.out.println("enter your bio subject:");
        bio=sc.nextInt();
        int result=marathi+english+math+phy+bio;
        per=(result*100)/500;
        if(per>=60)
        {
            System.out.println("first division");
        } else if (per >= 50) {
            System.out.println("second division");
        }
        else if(per>40) {
            System.out.println("third division");
        }
        else
        {
            System.out.println("fail");
        }
    }
}

