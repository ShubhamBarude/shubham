package Practice_Program;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr1.length;i++){

            sum=sum+arr1[i];

        }
        System.out.println(sum);
    }
}
