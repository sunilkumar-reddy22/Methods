package com.sunil.methods;
import java.util.Scanner;
        public class Greeting {
            public static void main(String[] args) {
                greetings();
            }
            static void greetings() {
                System.out.println("Functions and Methods");
                Scanner in = new Scanner(System.in);
                System.out.println("Enter integer: ");
                int num = in.nextInt();
                for(int i = 1; i <=num; i++) {
                    System.out.println(i);
                }

            }
        }




