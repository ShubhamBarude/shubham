package pra2_program;

public class CountEachChar {
    public static void main(String[] args) {


        String str = "sh ubh am";
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);
                charCount[ch]++;
            }

        for (int i = 0; i < charCount.length; i++) {

            if (charCount[i] > 0 ) {
                System.out.println("char:" + (char)i + ":count:" + charCount[i]);

            }
        }
    }
}
class WithoutSpace{

    public static void main(String[] args) {
        String str="sh ubh am";
        int count=0;
        int [] charCount=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isWhitespace(ch)){
             count++;
            }
            System.out.println("char="+(char)i+"count ="+count);
        }
    }
}