import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        // 5.1
        /*
        (Count positive and negative numbers and compute the average of numbers) Write
        a program that reads an unspecified number of integers, determines how many
        positive and negative values have been read, and computes the total and average of
        the input values (not counting zeros). Your program ends with the input 0. Display
        the average as a floating-point number.
         */

        /** TODO:
         *      1. while(true) because unspecified number of integers
         *      2. Take input from user
         *      3. Count positive and negative numbers
         *      4. Compute total
         *      5. Compute average
         *      6. Break if the input is 0
         *      7. Display result
         */

        Scanner input = new Scanner(System.in);
        int number;
        int positivesCount = 0;
        int negativesCount = 0;
        int sum = 0;
        while(true){
            System.out.println("Enter an integer number");
            number = input.nextInt(); // ****
            if (number == 0){
                break;
            }
            if (number > 0) // count positive numbers
                positivesCount++;
            else if (number < 0) // count negative numbers
                negativesCount++;
            sum += number; // find total
        }
        int totalNumbers = negativesCount + positivesCount;
        double average = (double) sum / totalNumbers;
        System.out.println("Positive numbers: " + positivesCount);
        System.out.println("Negative numbers: " + negativesCount);
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);

    }
}
