package Array;

public class praArray
{
    public static void main(String[] args) {
        int [] arr={4,5,8,9,1,2};
        int arr1= arr.length;
        int i;
        int j;
        int temp;
        for(i=0;i<arr1;i++)
        {
            for (j=i+1;j<arr1;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println("enter a assending order"+arr[i]);
        }
    }
}
