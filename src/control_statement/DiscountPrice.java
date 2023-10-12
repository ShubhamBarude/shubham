package control_statement;

import java.util.Scanner;

//while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100.
// If quantity and price per item are input through the keyboard, write a program to calculate the total expenses
public class DiscountPrice
{
    public static void main(String[] args) {

        double price;
        double count;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your price: ");
        price=sc.nextDouble();
        System.out.println("enter your quantity ");
        count = sc.nextDouble();

        if(count>=100)
        {
            double dis=((price*10)/100);
            System.out.println("enter a expenses:"+(price-dis));
        }
        else
        {
            System.out.println("there is no dicount for less than 100 quantity");
        }
    }
}
