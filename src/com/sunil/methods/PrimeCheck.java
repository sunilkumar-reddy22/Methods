package com.sunil.methods;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
       boolean ans =  prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n) {
        if (n <= 0) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
