package com.sunil.methods;

public class StringExample2 {
    public static void main(String[] args) {
       String ans =  greet("lightning");
        System.out.println(ans);
    }
    static String greet (String name) {
    String names = "Hello " + name;
    return names;
    }
}
