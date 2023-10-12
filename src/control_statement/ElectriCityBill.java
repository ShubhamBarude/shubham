package control_statement;

import java.util.Scanner;

public class ElectriCityBill {
    public static void main(String[] args) {
        int unit;               // input from user
        System.out.println("enter your unit:");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        if (unit <= 50)             //it is condition for below 50 units
        {
            double result = unit * 0.50;      // per unit price 0.50rs
            double a = (result * 20 / 100);      //  additional surcharge 20%
            System.out.println("your bill is below 50 units so it will charge:" + (result + (a)));// it is for adding 20%
        } else if (unit <= 150) {
            double result1 = unit * 0.75;
            double a = (result1 * 20 / 100);
            System.out.println("your bill is below 150 units so it will charge:" + result1 + (a));
        } else if (unit <= 250) {
            double result2 = unit * 1.20;
            double a = (result2 * 20 / 100);
            System.out.println("your bill is below 250 units so it will charge:" + result2 + (a));
        } else {
            double result3 = unit * 1.50;
            double a = (result3 * 20 / 100);
            System.out.println("your bill is above 250 units so it will charge:" + (result3 + (a)));
        }
    }
}
