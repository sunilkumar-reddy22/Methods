package com.sunil.methods;
import java.util.Scanner;
public class PythagoreanTriples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = in.nextInt();
        System.out.println("Enter second num: ");
        int b = in.nextInt();
        System.out.println("Enter Third num");
        int c = in.nextInt();
        sum(a , b , c);
    }
    static void  sum (int a, int b,int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
       int y = 0;
       if(max == a) {
           y = b * b + c * c;
       }
       else if( max == b) {
           y = a * a + c * c;
       }
       else {
           y = a * a + b * b;
       }
       int ans = max * max;

       if(y == ans){
            System.out.println("is triplet");
        }
        else {
            System.out.println("False");
        }

    }

}
