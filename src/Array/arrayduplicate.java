package Array;

import java.util.Scanner;

class arrayduplicate
{
//    Scanner sc=new Scanner(System.in);
//    int [] a=new int[10];
//    int i,j,c=0;
//        System.out.println("enter element");
//        for(i=0;i<a.length;i++)
//    {
//        a[i]=sc.nextInt();
    //}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] a={10,12,10,14,12};
        int i,j,c=0;
//        System.out.println("enter element");
//        for(i=0;i<a.length;i++)
//        {
//            a[i]=sc.nextInt();
//        }
//
//
//        System.out.println("printing element");
//        for(i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]+" ");
//        }
//
//        System.out.println("searching duplicate element");
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])

                {
                    System.out.println(a[j]+" ");
                    c++;


                }
            }
        }

        System.out.println("count of duplicate element="+c);
    }
}
