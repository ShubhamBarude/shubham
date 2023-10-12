package StarPattern;

public class PatternProgram1
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n;i++)   // for loop of i is used for rows
                                // in loop int i=1; it is starting point row
                                // i<=n; it is use for we want to start condition from i till n
                                // i++ ; it is for itaration of row
                                // this loop is rotatting 5 times upto till excuting program
        {
            for(int j=1;j<=n;j++)// for loop of j is used for column
                                 // in loop int j=1;it is starting point column
                                 // j<=n; it is use for we want to start condition from j till n
                                 // j++; it is for itaration of column
                                 // this loop is rotating when i loop is rotate 1 time then j loop is rotate 5 times
                                 // then second times i loop is rotate second time then j loop is rotate 5 times
                                 // this process till n th number means 5 because n=5
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
