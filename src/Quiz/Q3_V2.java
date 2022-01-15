package Quiz;

public class Q3_V2 {
    public static void main(String[] args) {
        String str = "abyzcdefyz";
        String key = "aabc";
        String encryptedStr = encrypt(str, key);
        System.out.println(encryptedStr.equals("abzbcdfhyz"));
        System.out.println(encryptedStr);
        System.out.println("abzbcdfhyz");

//        System.out.println(Arrays.toString(getLowercaseChars()));
//        System.out.println(getLowercaseChars().length);
    }

    public static String encrypt(String str, String key) {
        str = str.toLowerCase();
        if (isKeyLengthNotValid(key)) {
            key = getRandomKey();
        }

        int keyIndex = 0;
        int strLength = str.length();
        String encryptedStr = "";
        int charValue;
        char shiftedChar;
        for (int strIndex = 0; strIndex < strLength; strIndex++) {
            charValue = getCharValue(key.charAt(keyIndex));
            shiftedChar = shiftCharacter2(str.charAt(strIndex), charValue);
            encryptedStr += shiftedChar;
            keyIndex = updateKeyIndex(key, keyIndex);
        }

        return encryptedStr;
    }

    private static String getRandomKey() {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String key = "";
        int r;
        for (int i = 0; i < 8; i++) {
            r = (int) (Math.random() * 26);
            key += chars[r];
        }
        return key;
    }

    private static boolean isKeyLengthNotValid(String key) {
        return key.length() < 3 || key.length() > 20;
    }

    private static int updateKeyIndex(String key, int keyIndex) {
        keyIndex++;
        return keyIndex % key.length();
    }

    private static char shiftCharacter(char ch, int shiftValue) { // mod yerine çıkarma ile implement et
        // z + 2 = b | 122 = 25, 25 + 2 = 27 % 26 = 1 = b
        int charValue = ch + shiftValue;
        if (charValue > 122) // z + 2 = b = 1 | 122 + 2 = 124, 124 - 26 = 98 = b
            charValue -= 26;

        return (char) charValue;
    }

    private static char shiftCharacter2(char ch, int shiftValue) {
        char[] chars = getLowercaseChars();
        int indexOfCh = getIndex(chars, ch);
        indexOfCh = (indexOfCh + shiftValue) % chars.length;

        return chars[indexOfCh];
    }

    private static int getIndex(char[] chars, char ch) {
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                index = i;
                break;
            }
        }
        return index;
    }


    private static int getCharValue(char ch) {
        // a -> 97, a-97 -> 0, b -> 98, b - 97 -> 1
        return (int) ch - 97;
    }

    private static char[] getLowercaseChars() {
        int ch = 97;
        char[] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ch;
            ch++;
        }

        return chars;
    }
}
