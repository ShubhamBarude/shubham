package Array;

public class Arraytest1 {
    public static void main(String[] args) {
        String input = "ajajavabhjbjbjbjjhjhjavas";
        String repeatedWord = null;
        int wordLength = 4;
        int inputLength = input.length();
        for (int i = 0; i <= inputLength - wordLength; i++) {
            String word = input.substring(i, i + wordLength);
            if (input.indexOf(word, i + wordLength) != -1) {
                repeatedWord=word;
                System.out.println(repeatedWord);
            }
        }
        System.out.println("Repeated word: " + repeatedWord);
    }







}
