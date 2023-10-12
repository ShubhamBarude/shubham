package pra2_program;

public class DuplicateArray {
    public static void main(String[] args) {
        String str="programming";
        int count=0;
        char [] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(arr[i]==arr[j]){
                    System.out.println("print char:"+arr[j]);
                    count++;
                }
            }
        }
    }
}
