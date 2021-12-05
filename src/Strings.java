import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("str length: " + str.length());
        if (str.length() > 8)
            System.out.println("Max 8 characters.");
        else {
            System.out.println("Input is ok");
        }

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println("first char: " + str.charAt(0));
        int lastIndex = str.length() - 1;
        System.out.println("last char: " + str.charAt(lastIndex));

        String str2 = " and C programming";
        System.out.println("concat: " + str.concat(str2));

        // method, instance method and static method
        // method: () ile biten her şey methoddur. Örn; length(), toUpperCase()
        //         aynı zamanda (variable) veya (var1, var2, ..., varN). Örn; concat(str2), System.out.println(str + str2)
        //          Örn; Math.pow(a, b)
        // Methodlar bir iş yapar sana bir sonuç verir. Tekrar tekrar kullanılabilir.
        // Static method: ClassName.methodName() şeklinde kullanılır. Parantez içi dolu olabilir
        //          Örn; Math.random(), Math.pow(a,b), Math.sqrt(x)
        // Instance method: variableName.methodName(). Kullanılmak için değişkene ihtiyaç duyar.
        //          Örn; str.concat(str2), str.toUpperCase(), str.length()

        // Stringin harflerini tek tek yazdır
        int length = str.length();
        int i = 0;
        while (i < length) { // loop continuation/termination condition: i < length
            char ch = str.charAt(i);
            System.out.println(ch);
            System.out.println((int) ch);
            i++;
        }
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(4));

        length = str.length();
        for (int j = 0; j < length; j++) {
            char ch = str.charAt(j);
            System.out.println(ch);
        }

        // Stringdeki büyük harfleri sayma
        // "Java Programming"
        int uppercaseLetters = 0;
        length = str.length();
        for (int j = 0; j < length; j++) {
            char ch = str.charAt(j);
            boolean isUppercase = 65 <= ch && ch <= 90;
            if (isUppercase) {
                uppercaseLetters++;
            }
        }
        System.out.println("Uppercase letters: " + uppercaseLetters);

        // Stringdeki küçük harfleri say ve küçük harfleri ekrana bastır
        int lowercaseLetters = 0;
        String lowercaseChars = "";
        length = str.length();
        for (int j = 0; j < length; j++) {
            char ch = str.charAt(j);
            boolean isLowercase = 97 <= ch && ch <= 122;
            if (isLowercase) {
                lowercaseLetters++;
                lowercaseChars += ch;
            }
        }
        System.out.println("Lowercase letter count: " + lowercaseLetters);
        System.out.println("Lowercase chars: " + lowercaseChars);

        // Stringdeki bütün harfleri küçük yap
        length = str.length();
        String newStr = "";
        for (int j = 0; j < length; j++) {
            char ch = str.charAt(j);
            boolean isUppercase = 65 <= ch && ch <= 90;
            // A = 65, a = 97, B = 66, b = 98 => Büyükten küçüğe geçirmek için 32 eklemek gerekiyor.
            if (isUppercase) {
                ch = (char) (ch + 32); // büyük harften küçük harfe çevirme işlemi
                newStr += ch;
            } else { // lowercase
                newStr += ch;
            }
        }
        System.out.println("newStr: " + newStr);

        // Ödev: Stringin hepsini büyük harfe çevir
        int x = 3;
        int y = 5;
        System.out.println("x + y = " + x + y); // 35
        System.out.println("x + y = " + (x + y)); // 8


        Scanner input = new Scanner(System.in);
        // hatalı input alma şekli
        System.out.println("a: ");
        int a = input.nextInt();
        System.out.println("str: ");
        String str3 = input.nextLine();
        System.out.println("b: ");
        int b = input.nextInt();

        // input alma 1
        System.out.println("a1: ");
        int a1 = input.nextInt();
        input.nextLine();
        System.out.println("str: ");
        String str4 = input.nextLine();
        System.out.println("b1: ");
        int b1 = input.nextInt();
        input.nextLine();

        // input alma 2
        System.out.println("a2: ");
        int a2 = Integer.parseInt(input.nextLine());
        System.out.println("str5: ");
        String str5 = input.nextLine();
        System.out.println("b2: ");
        int b2 = Integer.parseInt(input.nextLine());
        System.out.println("d2: ");
        double d2 = Double.parseDouble(input.nextLine());



    }
}
