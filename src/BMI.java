import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if(18.5 <= bmi && bmi < 25)
            System.out.println("Normal");
        else if(25 <= bmi && bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
