package pra2_program;

public class NumberStringConcatenation {

    public static void main(String[] args) {
        String input = "we123 are13 dev45";
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = 0;
            StringBuilder numStr = new StringBuilder();

            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    numStr.append(c);
                } else if (numStr.length() > 0) {
                    sum += Integer.parseInt(numStr.toString());
                    numStr.setLength(0);
                }
            }

            if (numStr.length() > 0) {
                sum += Integer.parseInt(numStr.toString());
            }

            result.append(word).append("=").append(sum).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}









