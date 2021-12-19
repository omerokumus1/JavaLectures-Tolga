package Exercises;

public class Ex5_23 {
    public static void main(String[] args) {
        int n = 50000;
        double sumLeftToRight = 0;
        for (int i = 1; i <= n; i++) {
            sumLeftToRight += 1.0 / i;
        }

        double sumRightToLeft = 0;
        for (int i = n; i > 0; i--) {
            sumRightToLeft += 1.0 / i;
        }

        System.out.println("sumLeftToRight: " + sumLeftToRight);
        System.out.println("sumRightToLeft: " + sumRightToLeft);
        double error = Math.abs(sumLeftToRight - sumRightToLeft) / n;
        System.out.println("Error: " + error);
        System.out.println(1000000000.0 + 0.000000001);
    }
}
