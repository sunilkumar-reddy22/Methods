package com.sunil.methods;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
      int result  = sum();
        System.out.println(result);
    }
    static int sum(){
    Scanner in = new Scanner(System.in);
        System.out.println("Entetr a number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        return sum;


    }
}
