package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int count = 1;  // starting number
        while (count < 11) {  // number after
            System.out.println(count + "." + " I will be a good developer");
            count++; // this makes it exit the loop eventually
        }
        System.out.println("\nExercise 2:");
        for (int i = 81; i >= 1; --i) {
            if (i == 1) { //remove plural days
                System.out.println(i + " more day left of Year Up Code academy.");
            }
            else {
                System.out.println(i + " more days left of Year Up Code academy.");
            }
        }
    }
}