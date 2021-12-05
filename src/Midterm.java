public class Midterm {
    public static void main(String[] args) {
//        String s1, s2;
//        if (s1.length() == 0)
//            s2 = "hello";
//        else
//            s2 = "goodbye";
//
//        int x = 3, y = 3;
//        if (x + 3 == 6){
//            y = 1;
//            y += 1;
//        }
//    }

    /* Q2-e)
            1. segment için: 45 < x < 60 -> Pound Cake
                            x >= 60 -> Red Velvet Cake
            2. segment için: 32 < x < 45 && x < 50 -> Carrot Cake
                            Sponge Cake -> NOT POSSIBLE!
            3. segment için: x < 15 -> Yellow Butter Cake
            4. Segment için: 15 < x < 32 -> Flourless Cake
     */

//        double sum = 0;
//        double d = 0;
//        while (d != 10.0){
//            d += 0.1;
//            sum += d;
//            System.out.println(d);
//        }
//        System.out.println("sum: " + sum);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i+4);
//
//        }

        // konsoldan input girince enter tuşuna basılır. Enter tuşu verilen inputun sonuna \n
        // Örn; konsoldan 13 girilirse enter'a basıldığında input 13\n şeklinde olur
        // nextLine() harici diğer nextInt, nextDouble gibi methodlar ise \n karakterini okumaz bırakır.
        // Örn; 13 girildiğinde enter'a basılırsa 13\n şeklinde input girilmiş olur. nextInt ile okuma yaparsan
        //      nextInt 13 sayısını okur fakat \n karakterini orada bırakır.
        // nextLine harici bir methoddan sonra nextInt ya da nextDouble gelirse \n ile karşılaşır ve bunu okumaya çalışır.
        // Bunu integer veya double olarak çeviremediği için hata gerçekleşir.
        // \n karakteri nereye kadar okuma yapılacağını belirtir. 123654\n burada \n görene kadar okuma işlemi yapılır.
        // okuma işleminden sonra okunan kısım silinir \n kalır. Daha sonra tekrar nextInt kullanılırsa, nextInt otomatik
        // olarak \n görür ve hiçbir şey okumadan geçer.


        // Q4.a) min < max && max < bar.length()

        // Q4.b
        // sum += i / (i+2)
//        double sum = 0;
//        for (double i = 1; i < 100; i++) {
//            System.out.println(i + "/" + (i+2));
//            sum += i / (i+2);
//        }
//        System.out.println("Sum: " + sum);


        for (int row = 0; row < 4; row++){
            int number = 1;
            for (int col = 1; col <= 4-(row+1); col++){
                System.out.print(" ");
            }
            for (int col = 0; col < row+1; col++){
                number = (number)*2;
                System.out.print(number + " ");
            }
            for (int col = row-1; col >= 0; col--){
                number = number / 2;
                System.out.print(number +  " ");
            }
            System.out.println();
        }
    }
}
