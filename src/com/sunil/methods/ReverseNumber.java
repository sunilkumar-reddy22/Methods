package com.sunil.methods;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println( num());
    }
    static int num () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  Number: ");
        int n = in.nextInt();
        int result = 0;
        while(n > 0) {
            int rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }

        return result;
    }
}
