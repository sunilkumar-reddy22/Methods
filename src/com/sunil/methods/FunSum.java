package com.sunil.methods;
import java.util.Scanner;
public class FunSum {
    public static void main(String[] args) {
    while(true) {
        int result = sum();
        if(result == 0) {
            System.out.println("Bye!");
            break;
        }
        System.out.println("Result = " + result);
        System.out.println("Task finished! Thank you.");
    }
    }
    static int sum() {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = in.nextInt();
        if(a == 0) {
            System.out.println("invalid 0 not count in this code");
            return 0;
        }
        System.out.println("Enter second Number: ");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }
}
