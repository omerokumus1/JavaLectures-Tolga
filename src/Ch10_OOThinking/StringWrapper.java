package Ch10_OOThinking;

public class StringWrapper {
    /*
    Yazdığımız programda stringler üzerindeki özel ihtiyaçlarımızı buraya yazacaz.
    İhtiyaç 1: Verilen stringde en az 1 tane büyük harf olması gerekiyor.
    İhtiyaç 2: Şifre kontrolü: en az 2 büyük harf en az 2 sayı en az 8 karakter
     */
    String str;

    StringWrapper(String str){
        this.str = str;
    }

    public boolean containsAtLeastOneUppercase(){
        int count = 0, len = str.length();
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }

        return count >= 1;
    }

    public boolean isPasswordValid(){
        if (str.length() < 8)
            return false;

        int uppercaseLetter = 0, digitCount = 0, len = str.length();
        char ch;
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                uppercaseLetter++;
            else if (Character.isDigit(ch))
                digitCount++;
        }

        return (uppercaseLetter >= 2) && ( digitCount >= 2);
    }


}
