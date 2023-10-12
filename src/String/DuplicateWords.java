package String;

public class DuplicateWords {

    public static void main(String[] args) {
        String str = "programming";
        char[] chars = str.toCharArray();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }
        }

        System.out.println("The number of duplicate characters in the string '" + str + "' is " + count);

//        for (int i = 0; i < chars.length; i++) {
//            int tempCount = 0;
//            for (int j = 0; j < chars.length; j++) {
//                if (chars[i] == chars[j]) {
//                    tempCount++;
//                }
//            }
//
//            if (tempCount > 1) {
//                System.out.println(chars[i] + " : " + tempCount);
//            }
//        }
    }
}
