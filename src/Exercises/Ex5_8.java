package Exercises;

import java.util.Scanner;

public class Ex5_8 {
    public static void main(String[] args) {
        /** TODO:
         *      1. Prompt the user
         *      2. Take number of students
         *      3. Create a loop that loops number of students times
         *      4. Inside the loop, read student names and scores
         *      5. Store student name, which has the highest score
         *      6. Store max score
         *      7. At each iteration, compare student score with the max score. If student score is higher, then update
         *          student name and max score
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        System.out.println();

        String studentName;
        int studentScore;
        String studentNameWithHighestScore = "";
        int maxScore = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            studentName = input.nextLine();

            System.out.print("Enter student score: ");
            studentScore = input.nextInt(); input.nextLine();
            System.out.println();

            if (studentScore > maxScore){
                studentNameWithHighestScore = studentName;
                maxScore = studentScore;
            }

        }
        System.out.println("Student with highest score: " + studentNameWithHighestScore + ", score: " + maxScore);
    }
}
