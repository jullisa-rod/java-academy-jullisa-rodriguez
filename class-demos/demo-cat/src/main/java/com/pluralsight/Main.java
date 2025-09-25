package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 100;
        double weight = 60.5;
        char firstLetter = 'R';


        boolean isHappy = true;
        boolean canYouDoSomethingAboutIt = false;

        if(isHappy && canYouDoSomethingAboutIt)
        {
            System.out.println("ur happy, do something");
        } else if(isHappy && !canYouDoSomethingAboutIt) {
            System.out.println("ur happy,nothing else ");
        } else if(!isHappy && canYouDoSomethingAboutIt) {
            System.out.println("ur not happy, do something");
        }

        boolean eatenBreakfast = true;

        if(isHappy && eatenBreakfast) {
            System.out.println("Nice!");
        } else if(isHappy && !eatenBreakfast){
            System.out.println("ur hungry...");
        } else if(!isHappy && !eatenBreakfast) {
            System.out.println("u should eat! ");
        }



        String firstname = "Jullisa";
        String lastname = "Rodriguez";
        String fullname = firstname + " " + lastname;
        String favoriteColor = " Green";
        String favoriteArtist = "Wave to Earth";
        boolean eatenYet = true;
        int age = 23;
        System.out.println(fullname);
        String newFavoriteColor = "dark green";
        System.out.println(newFavoriteColor);
        System.out.println(favoriteColor);
        System.out.println(favoriteArtist);
        System.out.println(eatenYet);
        System.out.println(age);





    }
}
