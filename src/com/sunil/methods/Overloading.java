package com.sunil.methods;

public class Overloading {
    public static void main(String[] args) {
      int ans = fun(2, 4);
        System.out.println(ans);
      String anser = fun("kathy");
        System.out.println(anser);

    }
    static int fun(int a, int b) {
        return a + b;
    }

    static String fun(String name) {
        return name;
    }
}

