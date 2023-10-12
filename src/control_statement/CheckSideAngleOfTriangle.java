package control_statement;

public class CheckSideAngleOfTriangle {
    public static void main(String[] args) {
        int side1 = 28;
        int side2 = 14;
        int side3 = 13;
        if (side1 + side2 >= side3 && side2 + side3 >= side1 && side3 + side1 >= side2) {
            System.out.println("it is triangle");
        } else
        {
            System.out.println("it is not triangle");
        }
    }
}
