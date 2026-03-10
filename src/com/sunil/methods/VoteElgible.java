package com.sunil.methods;
import java.sql.SQLOutput;
import java.util.Scanner;
public class VoteElgible {
    public static void main(String[] args) {
       int age = vote();

    }
    static int vote() {
    Scanner in = new Scanner(System.in);
        System.out.println("Hello! enter your age: ");
        int age = in.nextInt();
        if(age >= 18) {
            System.out.println("You're! Elgibile for voting");
        }
        else {
            System.out.println("Not elgible");
        }
        return age;

    }
}
