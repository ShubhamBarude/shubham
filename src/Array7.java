public class Array7
{

        public static void main(String[] args) {
            int[] arr={ 1,2,3,4, 6, 7,8,9};
            int a=0;

            for(int i= arr.length;i>0;i--){
                for(int j=0;j<i;j++){
                    for (int k=0;k<=j;k++){
                        System.out.print(arr[k+a]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
                a++;
            }

        }
    }

