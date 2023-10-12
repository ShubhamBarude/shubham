package Array;

public class AccendingOrder {
    public static void main(String[] args) {

        int arr[]={5,4,6};
    int rr= arr.length;
    int i;
    int j;
    int k;




        for (i = 0; i < rr; i++) {
            for (j = i + 1; j < rr; j++) {
                if (arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;

                }
            }
            System.out.println("assending" + arr[i]);
            System.out.println("enter second smallest value :"+arr[1]);
        }
    }


}
