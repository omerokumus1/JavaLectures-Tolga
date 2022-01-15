package Ch7_SingleDimensionalArrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        /* Faydaları
         *   1. Loop kullanmayı sağlar.
         *   2. Verileri bir arada tutar
         *   3. Tek bir değişkenle birden fazla veriye erişebilirsin
         *
         * */

        // Boyut önceden bilinmek zorundadır
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // boyut otomatik atanır, digits.length -> 10
        int[] numbers = new int[5]; // boyut manuel girilir, numbers.length -> 5
        // "Java Programming is much more funnier than C Programming."

        System.out.println(Arrays.toString(numbers));

        // for-each, enhanced for
        for (int e :
                digits) {
            System.out.println(e * 2);
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i] * 2);
        }

        int max = findMax(digits);
        System.out.println("max: "+max);

    }

    private static int findMax(int[] digits) {
        int max = digits[0];
        for (int d :
                digits) {
            if (d > max)
                max = d;
        }
        return max;
    }
}
