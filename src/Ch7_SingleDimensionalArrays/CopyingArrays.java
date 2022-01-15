package Ch7_SingleDimensionalArrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] digitsCopy = getCopy(digits);
        System.out.println(Arrays.equals(digits, digitsCopy));
        int[] digitsCopy2 = new int[digits.length];
        System.arraycopy(digits, 0, digitsCopy2, 0, digits.length);
        System.out.println(Arrays.toString(digitsCopy2));
        int[] digitsCopy3 = digits.clone();
        System.out.println(Arrays.toString(digitsCopy3));
    }

    private static int[] getCopy(int[] digits) {
        int[] copy = new int[digits.length];
        int i = 0;
        for (int d :
                digits) {
            copy[i] = d;
            i++;
        }
//        for (int j = 0; j < digits.length; j++) {
//            copy[j] = digits[j];
//        }

        return copy;
    }
}
