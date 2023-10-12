import java.util.*;
class sumadd1
{
    int sum;
    public sumadd1()
    {
        int a=20;
        int b=30;
        int s;
        int sum=a+b;
    }
    public void disp()
    {
        System.out.println(" "+sum);
    }
    public static void main (String args[])
    {
        sumadd1 ob=new sumadd1();
        ob.disp();
    }
}