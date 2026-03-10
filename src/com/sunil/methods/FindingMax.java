package com.sunil.methods;
import java.util.Scanner;
public class FindingMax{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        maximumnumber(x , y , z);
        minimumnumber(x , y , z);
    }
    static void maximumnumber(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maximum Number is = " +max);
    }
    static void minimumnumber (int a, int b, int c) {
    int min = a;
    if (b < min) {
        min = b;
    }
    if (c < min) {
        min = c;
    }
        System.out.println("Minimum Number is = " + min);
    }

}
