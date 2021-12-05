public class Loops {
    public static void main(String[] args) {
        // do-while
        // sum squared numbers from 1 to n
        int n = 10;
        int sum = 0;
        int i = 1;
        do {
            sum += i*i;
            ++i;
        } while (i <= n);
        System.out.println("sum: " + sum);

        int x = i++;
        int y = ++i;


        String str = "Java Programming";
        String firstWord = "";
        i = 0;
        while(true){
            if (str.charAt(i) == ' ')
                break;
            else
                firstWord += str.charAt(i);

            i++;
        }

        str = "C Programming";
        i = 0;
        while(true){
            if (str.charAt(i) == 'P')
                break;
            if (i == str.length()-1)
                break;
            i++;
        }
        if (i == str.length()-1)
            System.out.println("P is not in the string");
        else
            System.out.println("Index of P is " + i);

        str = "Java Programming";
        i = 0;
        while(str.charAt(i) != 'P'){
            i++;
        }
        System.out.println("Index of P is " + i);

        str = "Java Programming";
        i = -1;
        int aCount = 0;
        while(i < str.length()){
            i++;
            if (i == str.length())
                break;
            if (str.charAt(i) != 'a')
                continue;
            aCount++;
        }

        aCount = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a')
                aCount++;
        }
        System.out.println(aCount);



    }
}
