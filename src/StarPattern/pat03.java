package StarPattern;

public class pat03
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int m=1;m<=n;m++)
        {
            for(int s=m; s<n;s++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
