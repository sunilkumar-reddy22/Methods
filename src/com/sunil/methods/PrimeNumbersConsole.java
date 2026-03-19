package com.sunil.methods;
import java.util.Scanner;
public class PrimeNumbersConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Start: ");
        int a = in.nextInt();
        System.out.println("Enter end: ");
        int b = in.nextInt();
        isprimeBetween(a, b);
    }

    static void isprimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }

        }
    }

    static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2;  i * i <= num; i++) {
            if (num % i  == 0) {
                return false;
            }

        }
        return true;
    }
}
