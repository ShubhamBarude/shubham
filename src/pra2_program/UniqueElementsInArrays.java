package pra2_program;

public class UniqueElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] array3 = {5, 6, 7, 8, 9};

        System.out.println("Unique Elements:");

        // Loop through array1 and compare each element with elements in array2 and array3
        for (int i = 0; i < array1.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isUnique = false;
                    break;
                }
            }

            for (int k = 0; k < array3.length; k++) {
                if (array1[i] == array3[k]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(array1[i]);
            }
        }

        // Loop through array2 and compare each element with elements in array1 and array3
        for (int i = 0; i < array2.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    isUnique = false;
                    break;
                }
            }

            for (int k = 0; k < array3.length; k++) {
                if (array2[i] == array3[k]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(array2[i]);
            }
        }

        // Loop through array3 and compare each element with elements in array1 and array2
        for (int i = 0; i < array3.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array1.length; j++) {
                if (array3[i] == array1[j]) {
                    isUnique = false;
                    break;
                }
            }

            for (int k = 0; k < array2.length; k++) {
                if (array3[i] == array2[k]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(array3[i]);
            }
        }
    }
}
