public class JavaMethods {
    public static void main(String[] args) {
        // Methodların Avantajları
        // 1. kodu tekrar tekrar kullanabilmek (code reusability)
        // 2. Kodu daha okunulabilir hale getirmek (code readability)
        // 3. Kodu daha kolay kontrol edebilmek, daha kolay değiştirebilmek
        // 4. Kodu modülarize edebilmek
        // 5. Kod daha kolay debug edilebilir.

        addTwoIntegers(5, 3);
        calculateAreaOfCircle(4);
        calculateAreaOfCircle(2);
        calculateAreaOfCircle(8);

        int sum = addTwoIntegers2(3, 4);
        System.out.println("Sum in main: " + sum);

        double area = calculateAreaOfCircle2(5);
        System.out.println("Area in main: " + area);

        System.out.println("Program ends.");
    }

    // Void Method örneği,              f(x,y)
    public static void addTwoIntegers(int x, int y) {
        int sum = x + y;
        System.out.println("sum: " + sum);

    }

    // Void method örneği - 2
    public static void calculateAreaOfCircle(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius of " + radius + " is " + area);
    }

    // Return yapan method örneği
    public static int addTwoIntegers2(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Return yapan method örneği - 2
    public static double calculateAreaOfCircle2(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }


}
