package com.pluralsight;

public class Movie {
    public static void main(String[] args) {
        String movieTitle = "Corpse Bride";
        int friendsInvited = 6;
        double pizzaPrice = 2.5;
        boolean gotPopcorn = true;
        System.out.println("We are watching " + movieTitle + " tonight with " + friendsInvited + " of my friends!" );
        System.out.println("Pizza is about " + pizzaPrice + ".");
        if (gotPopcorn) {
            System.out.println("we got popcorn!");
        } else if(!gotPopcorn) {
            System.out.println("We don't have popcorn yet.");
        }
    }
}
