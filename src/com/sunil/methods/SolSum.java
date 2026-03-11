package com.sunil.methods;
import java.util.Scanner;
public class SolSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number:" );
        int x = in.nextInt();
        System.out.println("Enter second Number: ");
        int y = in.nextInt();
        sum(x , y);
    }
    static void sum(int a, int b) {
    int ans = a + b;
        System.out.println("Sum = " + ans);
    }
}
