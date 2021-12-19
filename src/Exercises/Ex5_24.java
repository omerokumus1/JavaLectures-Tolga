package Exercises;

public class Ex5_24 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i < 100; i += 2) {
            sum += i / (i + 2);
        }
        System.out.printf("sum: %.3f", sum);





    }
}
