package pra2_program;

public class RevArr {

    public static void main(String[] args) {
        String str = "geeks for geeks ";
        int CHAR = 500;
        int count[] = new int[CHAR];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

            char[] ch = new char[str.length()];
            for (int i = 0; i < len; i++) {
                ch[i] = str.charAt(i);
                int count1 = 0;
                for (int j = 0; j < len; j++) {
                    if (ch[j] == str.charAt(i) && ch[j] != ' ') {
                        count1++;
                    }
                }
                if(count1==1)
                    System.out.println("char:"+str.charAt(i)+"count:"+count[str.charAt(i)]);
            }
        }
    }

