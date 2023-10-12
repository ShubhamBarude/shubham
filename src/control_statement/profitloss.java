package control_statement;

public class profitloss
{
    public static void main(String[] args) {
        int sp=1500;
        int cp=300;
        int result=sp-cp;

        if(result<=1000)
        {
            System.out.println("loss");
        }
        else {
            System.out.println("profit");
        }
    }
}
