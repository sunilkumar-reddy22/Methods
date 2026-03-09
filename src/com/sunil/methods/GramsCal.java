package com.sunil.methods;
import java.util.Scanner;
public class GramsCal {
    public static void main(String[] args) {
       double ans =  meat();
       double kg = ans / 1000;
        System.out.println("Hey! You get + " + ans + " grams of Chicken");
        System.out.println("in Kg's = " + kg);
    }
    static double meat() {
        Scanner in = new Scanner(System.in);
     //   double kg = 0;
        System.out.println("Enter Customer price: ");
        double user = in.nextDouble();
        System.out.println("Market Price: ");
        double marketprice = in.nextDouble();
        double result = user * 1000 / marketprice;
       // double kg  = result / 1000;
        return result;
    }
}
