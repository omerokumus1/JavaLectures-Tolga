public class RandomNumbers {
    public static void main(String[] args) {
        double d = Math.random();
        System.out.println(d);
        d = d * 100;
        System.out.println(d);
        double i = Math.floor(d);
        System.out.println(i);
        // 0 <= Math.random() < 1 -> 0 <= Math.random()*10 < 10 -> 0 <= Math.random()*100 < 100
        // 0 <= Math.random() < 1 -> 0 <= Math.random()*10 < 10 -> -5 <= Math.random()*10 - 5 < 5

        // Ex; produce a number between 23 and 47. 23 inclusive.
        // 0 <= r < 1 -> 0 <= r*24 < 24 -> 23 <= r*24 + 23 < 47
        int i2 = (int)(Math.random() * 24 + 23);
        System.out.println(i2);
    }
}
