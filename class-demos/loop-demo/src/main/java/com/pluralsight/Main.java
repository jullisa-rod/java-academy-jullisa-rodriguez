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
        System.out.println("For Loop: Counting from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // 2. WHILE LOOP
        // Use when you don't know how many times in advance
        System.out.println("\nWhile Loop: Counting down from 5");
        int j = 5;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            j--;
        }

        // 3. DO...WHILE LOOP
        // Always runs at least once, even if condition is false
        System.out.println("\nDo...While Loop: Run at least once");
        int k = 0;
        do {
            System.out.println("This will print once, even though k = " + k);
            k--;
        } while (k > 0);
        System.out.println("For Loop: printing even numbers till 50");
        for (int 1 = 1; 1 < 50; 1++) 1
        if (1%2==0){
            System.out.println("even number: " + i);
        }
｝
// 2. WHILE LOOP
// Use when you don't know how many times in advance
        System.out.println(" While Loop: Counting down timer from 5 seconds");
        int j = 5;
        while (>0){
            System.out.println("Countdown: " + j);
            try {
                Thread. sleep ( millis: 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
｝
                ゴー；
            }
// 3. DO... WHILE LOOP
// Always runs at least once, even if condition is false
            String enter = "";
            do {
                System.out.println("\nEnter whatever you want(exit to terminate): ");
                enter = scanner.nextLine().trim;
            } while (!enter.equals("exit"));

        }
}