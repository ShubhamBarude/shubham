package Array;

public class Array6 {
//    public static int countWordOccurrences(String text, String word) {
//        int count = 0;
//        int index = 0;
//
//        while (index != -1) {
//            index = text.indexOf(word, index);
//            if (index != -1) {
//                count++;
//                index += word.length();
//            }
//        }
//
//        return count;
//    }
//}
//static void get(){
//
//}
    public static void main(String[] args) {
        String text = "javafgjavagjkjava";
        String word = "java";
        int count = 0;
        int index = 0;

        while (index != -1) {
                index = text.indexOf(word, index);
                if (index != -1) {
                   // count++;
                    index += word.length();
                }
            }

           // return count;

       // Array6 obj=new Array6();


//        String text = "javafgjavagjkjava";
//        String word = "java";

       // int count = obj.countWordOccurrences(text, word);
        System.out.println("The word \"" + word + "\" appears " +count + " times in the string.");
    }
}
