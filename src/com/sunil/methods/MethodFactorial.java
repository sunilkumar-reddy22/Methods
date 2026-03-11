package com.sunil.methods;
import java.util.Scanner;
public class MethodFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int fact = in.nextInt();
        ans(fact);
    }
    static void ans(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++){
        factorial = factorial * i;

        }
        System.out.println("Factorial Number is = " + factorial);
    }

}
