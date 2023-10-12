package Array;

class Array5 {
    public static void main(String[] args) {
        int CHAR = 500;
        String str = "Array";
            int count[] = new int[CHAR];
            int len = str.length();
            for (int i = 0; i < len; i++)
                count[str.charAt(i)]++;
            char ch[] = new char[str.length()];
            for (int i = 0; i < len; i++) {
                ch[i] = str.charAt(i);
                int count1 = 0;
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == ch[j])
                        count1++;
                }
                if (count1 == 1)
                    System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
            }
        }
    }
//}
