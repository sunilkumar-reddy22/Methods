package com.sunil.methods;
import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = in.nextInt();
        System.out.println("Enter Second Number: ");
        int b = in.nextInt();
        System.out.println("Enter Third Number: ");
        int c = in.nextInt();
       boolean result =  isTriplet(a, b, c);
        System.out.println(result);
  }
  static boolean isTriplet(int a,int b, int c) {
       int max = Math.max(a, Math.max(b,c));
       if(max == a) {
           return a * a == b * b + c * c;
       }
       else if(max == b) {
           return b * b == a * a + c * c;
       }
       else {
          return c * c == a * a + b * b;
      }

  }
}
