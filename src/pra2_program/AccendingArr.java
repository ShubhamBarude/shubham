package pra2_program;

public class AccendingArr {
    public static void main(String[] args) {
        int []array={10,50,52,9,8,45,85};
        int Array=array.length;
        int temp;
        for(int i=0;i<Array;i++){
            for(int j=i+1;j<Array;j++){
                if(array[i]>array[j])
                {
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
                }
            }
            System.out.println("Assending order:"+array[i]);
            System.out.println("second smallest value:"+array[1]);
        }
    }
}
