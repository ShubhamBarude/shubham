package Array;

class test05
{

    public static void main(String[] args) {
        // Declare a constant to store the maximum number of characters in the input string
        int CHAR = 500;

        // Declare a string variable to store the input string
        String str = "Array";

        // Declare an integer array to store the counts of each character
        int[] count = new int[CHAR];

        // Declare an integer variable to store the length of the input string
        int len = str.length();

        // Iterate through the input string and increment the count for each character
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        // Declare a character array to store the characters in the input string
        char[] ch = new char[str.length()];

        // Iterate through the input string and store the characters in the character array
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);


            // Iterate through the character array
            //for (int i = 0; i < len; i++) {
            // Declare an integer variable to store the count of the current character
            int count1 = 0;

            // Iterate through the character array starting from the current character
            for (int j = 0; j <= i; j++) {
                // If the current character is equal to the character at the current index
                if (str.charAt(i) == ch[j])
                    // Increment the count
                    count1++;
            }


            // If the count is equal to 1, print the number of occurrences of the current character
            if (count1 == 1) {
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
            }
        }

    } }
//}
