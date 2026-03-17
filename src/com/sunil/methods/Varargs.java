package com.sunil.methods;
import java.util.Arrays;
public class Varargs {
    public static void main(String[] args) {
         fun(1,2);
         fun(1,2,3);
         fun(1,2,3,4);
         fun(1,2,3,4,5);

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
