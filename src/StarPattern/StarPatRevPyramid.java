package StarPattern;

public class StarPatRevPyramid
{
    public static void main(String[] args) {
        int n = 5;
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // System.out.println();
            // }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
