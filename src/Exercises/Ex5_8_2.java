package Exercises;

import java.util.Scanner;

public class Ex5_8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        System.out.println();

        String studentName;
        int studentScore;
        String studentNameWithHighestScore = "";
        int maxScore = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            studentName = input.nextLine();

            System.out.print("Enter student score: ");
            studentScore = input.nextInt(); input.nextLine();
            System.out.println();

            if (i == 0){
                studentNameWithHighestScore = studentName;
                maxScore = studentScore;
            }
            else{
                if (studentScore > maxScore){
                    studentNameWithHighestScore = studentName;
                    maxScore = studentScore;
                }
            }

        }
        System.out.println("Student with highest score: " + studentNameWithHighestScore + ", score: " + maxScore);
    }
}
