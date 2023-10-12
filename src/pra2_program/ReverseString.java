package pra2_program;

public class ReverseString {

    public static void main(String[] args) {
        String name = "shubham";
        // String reverse = "";
        int[] charcount = new int[256];
        //  int count = 0;
        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);
            charcount[ch]++;
         //  reverse = ch + reverse;
            //  count++;
        }
        for (int i = 0; i < charcount.length; i++) {
            if (charcount[i] > 0) {
                System.out.println("character ->" + (char) i + " :count= " + charcount[i]);
            }
            //   System.out.println("reversing character:"+reverse);
            //   System.out.println(count);
        }
    }
}
