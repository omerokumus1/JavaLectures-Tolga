public class ConditionalStatements {
    public static void main(String[] args) {
        // declaration - değişken tanımlama
        int x;
        // assignment - değer atamak
        x = 5;

        double y;
        y = 5.2;


        // multiple declaration
        int a, b;

        String str = "My name is Tolga.";

        char c = 'a';
        char c2 = 'c';
        String str2 = "x";

        x = x + 3;
        x += 3;
        // post increment
        x++;

        // post decrement
        x--;

        // pre decrement
        --x;

        // pre increment
        ++x;

        // gereksiz!!
        a = x++;
        b = ++x;

        // **** clear code over clever code

        // ASCII codes
        // A = 65, 0 = 48
        char ch = 65;
        int ch2 = 65;
        System.out.println("ch: " + ch);
        System.out.println("ch2: " + (char) ch2);
        char ch3 = 'a';
        char ch4 = 'A';
        char ch5 = '0';
        System.out.println("97 <= ch3 <= 122 " + ((97 <= ch3) && (ch3 <= 122)));

        boolean tavukSote = true;
        if (tavukSote == true)
            System.out.println("Yemek yerim");
        else
            System.out.println("Yemek yemem");

        int dolar = 11;
        if (dolar < 10)
            System.out.println("alım yap");
        else
            System.out.println("satış yap");

        ch3 = '1';
        if ((97 <= ch3) && (ch3 <= 122))
            System.out.println("ch3 is a smallcase letter. ch3: " + ch3);
        else
            System.out.println("ch3 is a uppercase letter. ch3: " + ch3);

        if ((97 <= ch3) && (ch3 <= 122))
            System.out.println("ch3 is a smallcase letter. ch3: " + ch3);
        else if ((65 <= ch3) && (ch3 <= 90)) {
            System.out.println();
            System.out.println("ch3 is an uppercase letter. ch3: " + ch3);
        } else if ((48 <= ch3) && (ch3 <= 57)) {
            System.out.println("ch3 is a number. ch3: " + ch3);
            System.out.println();
        } else
            System.out.println("ch3 is not a smallcase or uppercase letter or a number. ch3: " + ch3);

        if (false)
            System.out.println("12");
        System.out.println("5");

        x = 5;
        y = 1;
        if (x > 2) {
            if (y > 2) {
                double z = x + y;
                System.out.println("z is " + z);
            }
        } else
            System.out.println("L93 x is " + x);

        /////////////////////////////////////

        if (x > 2) {
            if (y > 2) {
                double z = x + y;
                System.out.println("z is " + z);
            } else
                System.out.println("L102 x is " + x);
        }

        int i = 2, j = -2, k = 3, z = 1;
        if (i > 0)
            if (j > 0)
                x = 0;
            else if (k > 0)
                y = 0;
            else
                z = 0;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        x = -5;
        y = -1;
        z = -3;
        dolar = 9;
        if (x < 0){
            if(y > 0 || z < 0){
                if (dolar < 10)
                    System.out.println("x < 0, y >0 || z < 0, dolar < 10");
                else
                    System.out.println("x < 0, y >0 || z < 0, dolar > 10");
            }
        }
    }
}
