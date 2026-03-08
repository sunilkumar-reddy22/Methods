package com.sunil.methods;

public class ProductDiscount {
    public static void main(String[] args) {
        calculateDiscount(100.0);
        calculateDiscount(250.0);
        calculateDiscount(80.0);

    }
    static void calculateDiscount(double price) {
    double discount = price * 0.10;
    double finalPrice = price - discount;
        System.out.println("Final Price: " + finalPrice);
    }
}
