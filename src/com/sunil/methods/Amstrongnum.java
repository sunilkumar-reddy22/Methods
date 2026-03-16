package com.sunil.methods;

public class Amstrongnum {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        for(int i = 100; i < 100; i++) {
            if (isamstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
     static boolean isamstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
