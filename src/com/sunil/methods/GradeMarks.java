package com.sunil.methods;
import java.util.Scanner;
public class GradeMarks {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int score = grades.nextInt();
        marks( score);

    }
    static void marks(int grade) {
    if(grade <= 0 || grade > 100) {
        System.out.println("Invalid");
    }
        else if  (grade >= 91 && grade <= 100) {
            System.out.println("Grade is = AA");
        }
        else if (grade >= 81 && grade <= 90) {
            System.out.println("Grade is = AB");
        }
        else if (grade >= 71 && grade <= 80) {
            System.out.println("Grade is = BB");
        }
        else if (grade >= 61 && grade <= 70) {
            System.out.println("grade is = BC");
        }
        else if (grade >= 51 && grade <= 60) {
            System.out.println("Grade is = CD");
        }
        else if(grade >= 41 && grade <= 50) {
            System.out.println("Grade is DD");
        }
        else if  (grade < 40) {
            System.out.println("retake");
        }

    }
}
