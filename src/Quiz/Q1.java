package Quiz;

import java.util.Arrays;

public class Q1 {
    //      [12 pts] Implement the following method that swaps the values at column col1 and column col2 of array cm.
    //          public static void swapMatrix(char[] cm, int coll, int co12)
    //
    //    b) [3 pts] What are the values of arr Ch after the following statements? char[][] arr Ch = {{'a', 'b', 'c', 'd'), {'e', 'f', 'g', 'h'}, {'k', 'm', 'n', 'p'}};
    //
    //        swapMatrix (arrCh, 2, 1);

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        swapMatrix(chars, 2, 3);
        System.out.println(Arrays.toString(chars));
    }

    public static void swapMatrix(char[] cm, int col1, int col2) {
        char temp = cm[col1];
        cm[col1] = cm[col2];
        cm[col2] = temp;
    }


}
