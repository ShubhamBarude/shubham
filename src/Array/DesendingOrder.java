package Array;

public class DesendingOrder
{
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5,6,8,5,4,6,4};
         int rr=arr.length;
         int i;
         int j;
         int k ;
        for (i = 0; i < rr; i++) {
            for (j = i + 1; j < rr; j++) {
                if (arr[i] < arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;

                }

            }
            System.out.println("decending:" + arr[i]);

        }
        System.out.println("Second largest number:"+arr[rr-9]);
        System.out.println("second largest number:"+arr[1]);
    }
}
