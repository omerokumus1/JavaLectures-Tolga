package Quiz;

public class Q2 {

    public static void main(String[] args) {

    }

    public static int countOcc(String[] wordList, String word) {
        int count = 0;
        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].equals(word)) {
                count++;
            }
        }

        return count;
    }
}
