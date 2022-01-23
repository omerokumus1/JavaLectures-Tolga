package Prog1_2020_Final;

import java.util.Arrays;

public class Session_1 {
    public static void main(String[] args) {
        // a
        int i = 1, j = 2;
        swapInts(i, j);
        System.out.println("i: " + i + ", j: " + j);

        int[] arr1 = {1, 2, 3, 4};
        swapInts(arr1[0], arr1[3]);
        System.out.println(Arrays.toString(arr1));

        // b
        String[] wordArray = {"1", "2", "3", "3", "4", "3", "5"};
        String word = "3";
        System.out.println(countOccurrences(wordArray, word));

        // c
        String str = "WE LOVE CSE1141 A LOT"; // WVE1TEOES14AOLC1L
//        String str = "TOLGA";
        System.out.println(encryption2(str).equals("WVE1TEOES14AOLC1L"));
    }

    // a
    public static void swapInts(int v1, int v2) {
        int temp = v1;
        v1 = v2;
        v2 = temp;
    }

    // b
    public static int countOccurrences(String[] wordArray, String word) {
        int count = 0;
        for (String s : wordArray) {
            if (s.equals(word))
                count++;
        }
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].equals(word))
//                count++;
//        }

        return count;

    }

    // c
    public static String encryption(String s) {
        String formattedStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                formattedStr += s.charAt(i);
        }
        String encryptedStr = "";
        for (int i = 0; i < formattedStr.length(); i += 4) {
            encryptedStr += formattedStr.charAt(i);
        }
        for (int i = 1; i < formattedStr.length(); i += 2) {
            encryptedStr += formattedStr.charAt(i);
        }
        for (int i = 2; i < formattedStr.length(); i += 4) {
            encryptedStr += formattedStr.charAt(i);
        }

        return encryptedStr;
    }

    // c_2
    public static String encryption2(String s) {
        String formattedStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                formattedStr += s.charAt(i);
        }

        int row = 3, column = formattedStr.length();
        char[][] encryptionTable = new char[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                encryptionTable[i][j] = '.';
            }
        }
        int i = 0, j = 0, index = 0;
        int direction = 1; // 1 for up, -1 for down
        while (j < column) {
            if (direction == 1) {
                encryptionTable[i][j] = formattedStr.charAt(index);
                if (i == 2) {
                    direction = -1;
                    i--;
                }
                else
                    i++;
            } else if (direction == -1) {
                encryptionTable[i][j] = formattedStr.charAt(index);
                if (i == 0) {
                    direction = 1;
                    i++;
                }
                else
                    i--;
            }

            j++;
            index++;

        }

        StringBuilder encryptedStr = new StringBuilder();
        for (int k = 0; k < row; k++) {
            for (int l = 0; l < column; l++) {
                if (encryptionTable[k][l] != '.')
                    encryptedStr.append(encryptionTable[k][l]);
            }
        }

        for (int k = 0; k < row; k++) {
            for (int l = 0; l < column; l++) {
                System.out.printf("%2s", encryptionTable[k][l]);
            }
            System.out.println();
        }

        return encryptedStr.toString();

    }

}
