package com.pluralsight;
import java.util.Scanner; // you have to import first to be able to get the input thing
public class Movie {
    public static void main(String[] args) {

// #####################
        //String movieTitle = "Corpse Bride";
        int friendsInvited = 6;
        double pizzaPrice = 2.5;
        boolean gotPopcorn = true;
        //System.out.println("We are watching " + movieTitle + " tonight with " + friendsInvited + " of my friends!" );
        System.out.println("Pizza is about " + pizzaPrice + ".");
        if (gotPopcorn) {
            System.out.println("we got popcorn!");
        } else if(!gotPopcorn) {
            System.out.println("We don't have popcorn yet.");
        } if (pizzaPrice > 3){
            System.out.println("Whoa, that pizza is expensive! ");
        } else {
            System.out.println("Nice budget-friendly movie night!");
        }

        //System.out.printf("Movie %s | Guests: %d | Total Cost: $%f.2", movieTitle, friendsInvited, pizzaPrice);
// ############################################
        Scanner read = new Scanner(System.in); // this is the line for the input

// todo: What is Scanner? Google, Ask my peers, Ask Remsey
        System.out.printf("Enter movie name: ");
        String movieTitle = read.nextLine();

        System.out.printf("Enter number of friends: ");
        int friendsAmount = read.nextInt(); // have to put data type then variable = read.nextDATATYPE();

        System.out.printf("Enter pizza price per slice  (without dollar sign (e.g. 5.04) ");
        double pizzaPerSlice = read.nextDouble();

        System.out.println("Is there popcorn: (Enter true or false) ");
        boolean popcorn = read.nextBoolean();


// Why + 1? I`m adding 1 because I am also eating! Of course
        double totalPizzaCost = Math.round(pizzaPerSlice*(friendsAmount+1));
        System.out.printf("Movie name is: " + movieTitle + ", Guests: " + friendsAmount +" Total cost: " + totalPizzaCost);
    }
}
