package pra2_program;

import java.util.Scanner;
class VotteingExp extends RuntimeException {
    VotteingExp(String msg){
        super (msg);
    }

}

public class ElectionException {
    public static void main(String[] args) {


        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        age=sc.nextInt();
        try {
            if (age<=18) {
                throw new VotteingExp("not eligible for voting");
            } else {
                System.out.println(" eligible for voting");
            }
        }
        catch (VotteingExp e)
        {
            System.out.println("it is catch block:");
            e.printStackTrace();
        }
        System.out.println("it is last statements");
    }

}
