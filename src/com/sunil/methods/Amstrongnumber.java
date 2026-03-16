package com.sunil.methods;
import java.util.Scanner;
public class Amstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        System.out.println( isamstrong(num));
     //   int result = num;
     //   System.out.println(result);
     //   int result = num;
    }
    static boolean isamstrong(int a) {
        int original = a;
        int sum = 0;

        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }

}
