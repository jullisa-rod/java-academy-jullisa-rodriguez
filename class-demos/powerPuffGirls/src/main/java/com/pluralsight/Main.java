package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        String Powerpuffgirlgame = "Blossom";
        //  Todo: A PowerPuff fighting game
        //  Features
        // - Play online - play solo
        // Character customization
        //Costumes
        // Finishing Moves
        // Team Attack
        // Dialogue
        // Health boost

        // bm = Blossom
        PowerpuffGirl blossom = new PowerpuffGirl("Blossom", "pink");
        PowerpuffGirl bubbles = new PowerpuffGirl(  "Bubbles", "blue");
        PowerpuffGirl buttercup = new PowerpuffGirl( "Buttercup", "green");
        //blossom.name = "Jullie";
        System.out.println(buttercup);
        System.out.println("Took 80 damage!");
        System.out.println(blossom.getHealth());
        blossom.setHealth(2044);
    }
}