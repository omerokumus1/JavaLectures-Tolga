package HW;

import java.util.Scanner;

/*
42 123 4598
DNumber:_2_2_4_9_
LNumber:4414 38 598
Number is Invalid
 */

public class HW4_Q2 {
    public static void main(String[] args) {
        /**     TODO:
         *          0. Validate: String boyu 1'den küçükse veya string digit veya boşluk harici bir karakter içeriyorsa
         *              false, değilse true
         *          1. Digitleri say ve bu boyutta bir array oluştur
         *          2. Her bir digit'i integer'a çevir ve oluşturduğun array'e at.
         *          3. Son indexten başla, son -1, son -3, son -5.. şeklinde elemanları say ve bu boyutta bir array oluştur
         *          4. Son indexten başla, son -1, son -3, son -5.. şeklinde elemanları al ve oluşturduğun arraye at
         *          5. Her bir elemanı 2 ile çarp, çarpım sonucu 9'dan büyükse 9 çıkart.
         *          6. İlk arrayden başka, son, son-2, son-4.. şeklinde almadığın sayıları topla
         *          7. 2 ile çarpıp bulduğun sayıları topla
         *          8. 6. ile 7. basamaklarda bulduğun 2 sayıyı topla
         *          9. Eğer toplam sayı 10'a tam bölünüyorsa ve bölüm bir çift sayıysa "number is valid", değilse "invalid"
         */
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (validateNumber(str)) { // isNumberValid()
            int[] digits = initializeDigits(str);
            int[] dNumbers = getDNumbers(digits);
            int[] remainingNumbers = getRemainingNumbers(digits);
            int[] doubledNumbers = applyDoubling(dNumbers);
            String lNumbers = initializeLNumbers(doubledNumbers, remainingNumbers);
            int totalSum = getSumOf(doubledNumbers, remainingNumbers);
            printDNumbers(dNumbers, digits);
            printLNumbers(lNumbers);
            printNumberValidityResult(totalSum);
        } else {
            System.out.println("Invalid input");
        }
    }

    private static void printNumberValidityResult(int totalSum) {
        if (isDivisibilityValid(totalSum)) {
            System.out.println("Number is Valid");
        } else {
            System.out.println("Number is Invalid");

        }
    }

    private static boolean isDivisibilityValid(int totalSum) {
        return isDivisibleByTen(totalSum) && isTotalSumEvenlyDivisible(totalSum);
    }

    private static boolean isDivisibleByTen(int totalSum) {
        return totalSum % 10 == 0;
    }

    private static void printLNumbers(String lNumbers) {
        System.out.println("LNumber:" + lNumbers);
        System.out.println();
    }

    private static String initializeLNumbers(int[] doubledNumbers, int[] remainingNumbers) {
        int size = doubledNumbers.length + remainingNumbers.length;
        String lNumbers = "";
        if (size % 2 == 0) {
            for (int i = doubledNumbers.length - 1; i >= 0; i--) {
                lNumbers += doubledNumbers[i] + "" + remainingNumbers[i];
            }
        } else {
            // 4414 38 598
            lNumbers += remainingNumbers[remainingNumbers.length - 1];
            for (int i = doubledNumbers.length - 1; i >= 0; i--) {
                lNumbers += doubledNumbers[i] + "" + remainingNumbers[i];
            }

        }
        return lNumbers;
    }

    private static boolean isTotalSumEvenlyDivisible(int totalSum) {
        int quotient = totalSum / 10;
        return quotient % 2 == 0;

    }

    private static int getSumOf(int[] doubledNumbers, int[] remainingNumbers) {
        int sum = 0;
        for (int i = 0; i < doubledNumbers.length; i++) {
            sum += doubledNumbers[i];
        }
        for (int i = 0; i < remainingNumbers.length; i++) {
            sum += remainingNumbers[i];
        }
        return sum;
    }

    private static int[] applyDoubling(int[] dNumbers) {
        int[] doubledNumbers = new int[dNumbers.length];
        int doubled;
        for (int i = 0; i < dNumbers.length; i++) {
            doubled = dNumbers[i] * 2;
            if (doubled > 9)
                doubled -= 9;
            doubledNumbers[i] = doubled;
        }
        return doubledNumbers;
    }

    private static void printDNumbers(int[] dNumbers, int[] digits) {
        System.out.print("DNumber:");
        if (digits.length % 2 == 0) {
            for (int i = dNumbers.length - 1; i >= 0; i--) {
                System.out.print(dNumbers[i] + "_");
            }
        } else {
            System.out.print("_");
            for (int i = dNumbers.length - 1; i >= 0; i--) {
                System.out.print(dNumbers[i] + "_");
            }
        }
        System.out.println();
    }

    private static int[] getRemainingNumbers(int[] digits) {
        int remainingNumbersCount = getRemainingNumbersCount(digits);
        int[] remainingNumbers = new int[remainingNumbersCount];
        int lastIndex = digits.length - 1;
        int j = 0;
        for (int i = lastIndex; i >= 0; i -= 2) {
            remainingNumbers[j] = digits[i];
            j++;
        }

        return remainingNumbers;
    }

    private static int getRemainingNumbersCount(int[] digits) {
        int remainingNumbersCount;
        if (digits.length % 2 == 0)
            remainingNumbersCount = digits.length / 2;
        else
            remainingNumbersCount = digits.length / 2 + 1;
        return remainingNumbersCount;
    }

    private static int[] getDNumbers(int[] digits) {
        int[] dNumbers = new int[digits.length / 2];
        int lastIndex = digits.length - 1;
        int j = 0;
        for (int i = lastIndex - 1; i >= 0; i -= 2) {
            dNumbers[j] = digits[i];
            j++;
        }

        return dNumbers;
    }

    public static int[] initializeDigits(String str) {
        int digitCount = getDigitCount(str);
        int[] digits = new int[digitCount];
        getDigits(str, digits);
        return digits;
    }

    private static void getDigits(String str, int[] digits) {
        char ch;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits[j] = Integer.parseInt(ch + "");
                j++;
            }
        }
    }

    private static int getDigitCount(String str) {
        int digitCount = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch))
                digitCount++;
        }

        return digitCount;
    }

    public static boolean validateNumber(String number) {
        if (number.length() <= 1)
            return false;
        if (doesStringContainNonDigitCharacter(number))
            return false;

        return true;
    }

    public static boolean doesStringContainNonDigitCharacter(String str) {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (!(Character.isDigit(ch) || Character.isSpaceChar(ch)))
                return true;
        }

        return false;

    }


}
