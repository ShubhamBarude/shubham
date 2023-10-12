package control_statement;

import java.util.Scanner;

public class HardnessOfSteel
{
    public static void main(String[] args) {
        int hardness;
        double carbon;
        int tensile;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hardness");
        hardness = sc.nextInt();
        System.out.println("enter carbon");
        carbon = sc.nextDouble();
        System.out.println("enter tensile");
        tensile = sc.nextInt();
        if (hardness > 50 && carbon < 0.7 && tensile > 5600) {
            System.out.println("grade is 10");
        } else if (hardness > 50 && carbon < 0.7) {
            System.out.println("grade is 9");
        } else if (carbon < 0.7 && tensile > 5600) {
            System.out.println("grade is 8");
        } else if (hardness > 50 && tensile > 5600) {
            System.out.println("grade is 7");
        } else if (hardness > 50 || carbon < 0.7 || tensile > 5600) {
            System.out.println("grade is 6");
        } else if (hardness < 50 && carbon < 0.7 && tensile < 5600) {
            System.out.println("grade is 5");
        }
    }

}
