package Array;

public class Array2
{
    public static void main(String[] args) {
        int [] arr2={6,9,5,4,2,1,3,8,7};
        int array= arr2.length;
        int i;
        int j;
        int temp;
        for(i=0;i<array;i++)
        {
            for(j=i+1;j<array;j++)
            {
                if(arr2[i]<arr2[j])
                {
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            System.out.println("desending order:"+arr2[i]);
            System.out.println("second largest value :"+arr2[1]);
           // System.out.println("second smallest value"+());
        }
    }
}
