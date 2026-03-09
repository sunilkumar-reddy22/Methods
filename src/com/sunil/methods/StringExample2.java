package com.sunil.methods;
import java.util.Scanner;
public class StringExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");    ;
        String name = in.next();
       String ans =  greet(name);
        System.out.println(ans);
    }
    static String greet (String name) {
    String names = "Hello " + name;
    return names;
    }
}
