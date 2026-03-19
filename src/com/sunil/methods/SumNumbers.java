package com.sunil.methods;
import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = in.nextInt();
       int ans = Sum(a);
        System.out.println(ans);

    }
    static int Sum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
          //  return result + i;
           result  = result + i;
        }
        return result;

    }

}
