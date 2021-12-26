package Exercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        /** TODO:
         *      1. Bir sayının asal sayı olup olmadığını bul
         *      2. 1'den başlayarak limite kadar olan sayıları tek tek kontrol edip asal sayı olanları al.
         *
         */


        // Solution 1- methodlu
        int limit = 100;
        // 2. 2'den başlayarak limite kadar olan sayıları tek tek kontrol edip asal sayı olanları al.
        for (int number = 2; number < limit; number++) {
            if (isPrime(number))
                System.out.print(number + " ");

        }

        // Solution 2- methodsuz
        boolean isPrime;
        // 2. 2'den başlayarak limite kadar olan sayıları tek tek kontrol edip asal sayı olanları al.
        for (int number = 2; number < limit; number++) {
            isPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(number + " ");
        }

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 ...
        // 2 3 5 7 11 13
    }

    // 1. Bir sayının asal sayı olup olmadığını bul
    private static boolean isPrime(int number) {
        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0)
                return false;
        }

        return true;
    }
}
