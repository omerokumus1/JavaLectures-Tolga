package Ch7_SingleDimensionalArrays;

import java.util.Arrays;

public class PassingArraysToMethods {
    public static void main(String[] args) {
        // pass-by-value
        int x = 5;
        increment(x);
        System.out.println("x in main: " + x);
        // int, boolean, double, float vb primitive type değişkenler pass-by-value ile geçer

        // pass-by-reference
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        changeFirstItem(digits, -1);
        System.out.println("Digits in main: " + Arrays.toString(digits));
        // objeler pass-by-reference ile geçer
    }
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
    // 7
    private static void changeFirstItem(int[] digits, int item) {
        digits[0] = item;
        System.out.println("digits in the method: " + Arrays.toString(digits));
    }

    private static void increment(int x) {
        x++;
        System.out.println("x in increment method: " + x);
    }


}
