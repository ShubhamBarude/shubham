package pra2_program;

public class DensendingArr {
    public static void main(String[] args) {
        int arr[]={2,3,6,9,7,};
        int Array=arr.length;
        int temp;
        for(int i=0;i<Array;i++)
        {
            for(int j=i+1;j<Array;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.println("print desending order:"+arr[i]);
            System.out.println("print second smallest value:"+arr[1]);
        }
    }
}
