package package2;

class ArrayTest2{
    public static void main(String args[]){
        int i,j;
        int k;
        int[] arr={6,5,4};
        int rr=arr.length;
        for(i=0;i<rr;i++){
            for(j=i+1;j<rr;j++){
                if(arr[i]>arr[j]){
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
            System.out.println("it is array printing accending arry"+arr[i]);

        }


    }









}