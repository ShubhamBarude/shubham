package control_statement;

public class CheckNumber
{
    public static void main(String[] args) {
        int num=20;
        if(num%5==0 && num%11==0)
        {
            System.out.println("divisiable by 5 ,11");
        }
        else {
            System.out.println("not divisiable");
        }
    }
}
