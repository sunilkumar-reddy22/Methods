package com.sunil.methods;
import java.util.Scanner;
public class VoteElgible {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Hello! enter your age: ");
        int age = in.nextInt();

        if (iseligible(age)) {
            System.out.println("You're! Elgibile for voting");
        } else {
            System.out.println("Not elgible");
        }
    }

    static boolean iseligible(int age) {
        return age >= 18;
    }
}





