package com.sunil.methods;
import java.util.Scanner;
import java.util.Random;

public class HospitalBooking {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Hospital Booking System!");
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Select your preference: 1.Male  2.Female");
        int gender = in.nextInt();
        chooseDepartment(name, gender);
    }

    static void chooseDepartment(String name, int gender) {
        System.out.println("Select Department:");
        System.out.println("1. Cardiology");
        System.out.println("2. Urology");
        System.out.println("3. Neuro Surgeon");
        System.out.println("4. Bone Doctor");
        System.out.println("5. General Doctor");
        int choice = in.nextInt();
        switch (choice) {
            case 1: chooseDoctor(name, gender, "Cardiology"); break;
            case 2: chooseDoctor(name, gender, "Urology"); break;
            case 3: chooseDoctor(name, gender, "Neuro Surgeon"); break;
            case 4: chooseDoctor(name, gender, "Bone Doctor"); break;
            case 5: chooseDoctor(name, gender, "General Doctor"); break;
            default: System.out.println("Invalid choice!");
        }
    }

    static void chooseDoctor(String name, int gender, String department) {
        System.out.println("Select Doctor for " + department);
        System.out.println("1. Dr. Sharma");
        System.out.println("2. Dr. Reddy");
        System.out.println("3. Dr. Patel");
        int choice = in.nextInt();
        String doctor = "";
        switch (choice) {
            case 1: doctor = "Dr. Sharma"; break;
            case 2: doctor = "Dr. Reddy"; break;
            case 3: doctor = "Dr. Patel"; break;
            default: System.out.println("Invalid choice!");
        }
        chooseDay(name, gender, department, doctor);
    }

    static void chooseDay(String name, int gender, String department, String doctor) {
        System.out.println("Select Day:");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        int choice = in.nextInt();
        String day = "";
        boolean available = false;
        switch (choice) {
            case 1: day = "Monday"; available = true; break;
            case 2: day = "Tuesday"; available = false; break;
            case 3: day = "Wednesday"; available = true; break;
            case 4: day = "Thursday"; available = true; break;
            case 5: day = "Friday"; available = false; break;
            default: System.out.println("Invalid choice!");
        }
        bookAppointment(name, gender, department, doctor, day, available);
    }

    static void bookAppointment(String name, int gender, String department, String doctor, String day, boolean available) {
        if (available) {
            Random rand = new Random();
            int appointmentId = rand.nextInt(9000) + 1000;
            String genderTitle = (gender == 1) ? "Mr." : "Ms.";
            System.out.println("Appointment Booked Successfully!");
            System.out.println("Name: " + genderTitle + " " + name);
            System.out.println("Department: " + department);
            System.out.println("Doctor: " + doctor);
            System.out.println("Day: " + day);
            System.out.println("Appointment ID: " + appointmentId);
        } else {
            System.out.println("Sorry! Doctor not available on " + day);
            System.out.println("Please choose another day.");
        }
    }
}
