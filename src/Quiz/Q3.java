package Quiz;

import java.util.Locale;

public class Q3 {
    public static void main(String[] args) {
        String str = "abyzcdefyz";
        String key = "aabc";
        String encryptedStr = encrypt(str, key);
        System.out.println(encryptedStr.equals("abzbcdfhyz"));
        System.out.println(encryptedStr);
        System.out.println("abzbcdfhyz");
    }

    public static String encrypt(String str, String key) {
        str = str.toLowerCase();
        if (key.length() < 3 || key.length() > 20) { // methoda çevir, array ile implement edilebilir
            key = "";
            int r;
            for (int i = 0; i < 8; i++) {
                r = (int) (Math.random() * 26 + 97);
                key += (char) r;
            }
        }

        int keyIndex = 0;
        int strLength = str.length();
        String encryptedStr = "";
        int charValue;
        char shiftedChar;
        for (int strIndex = 0; strIndex < strLength; strIndex++) {
            charValue = getCharValue(key.charAt(keyIndex));
            shiftedChar = shiftCharacter(str.charAt(strIndex), charValue);
            encryptedStr += shiftedChar;
            keyIndex = updateKeyIndex(key, keyIndex);
        }

        return encryptedStr;
    }

    private static int updateKeyIndex(String key, int keyIndex) {
        keyIndex++;
        if (keyIndex == key.length())
            keyIndex = 0;

        return keyIndex;
    }

    private static char shiftCharacter(char ch, int shiftValue) { // mod yerine çıkarma ile implement et
        // z + 2 = b | 122 = 25, 25 + 2 = 27 % 26 = 1 = b
        int charValue = getCharValue(ch); // a, b, c, ..., z -> 0, 1, 2 ..., 25
        charValue = (charValue + shiftValue) % 26;
        return (char) (charValue + 97);
    }

    private static int getCharValue(char ch) {
        // a -> 97, a-97 -> 0, b -> 98, b - 97 -> 1
        return (int) ch - 97;
    }
}
