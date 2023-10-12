package control_statement;

public class Rectangle
{
    public static void main(String[] args) {
        int width =5;
        int length=4;
        double area=width*length;
        double peri=2*(width+length);
        if (peri<area)
        {
            System.out.println("peri is greater");
        }
        else {
            System.out.println("peri is not greater");
        }
    }
}
