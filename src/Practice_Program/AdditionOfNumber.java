package Practice_Program;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AdditionOfNumber {
    public static void main(String[] args) {
        String str= "we123 are569 dev548";

        int intVal = 0;
        String s="";
        int sum=0;
        char[] charVal = new char[256];
        int[] arr = new int[50];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                arr[i] = intVal * 10 + (ch - '0');

                sum= sum+arr[i];
            } else {
                charVal[i] = ch;
                s = s+ charVal[i];

            }
        }

        System.out.println("Value: " + sum + " " + s);

    }
}
