package org.Wizard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Harry Potter \u26A1 at Home, the wizarding \uD83E\uDDD9 RPG");
        Player player = new Player();
        player.setName(Player.name);
        player.setWand(Player.wand);
        player.setHouse(Player.house);

        System.out.println(Player.name + " do you have the makings of the greatest wizards? Can you meet all the challenges? Let's get started!");
        System.out.println("Your goal is to complete your education at Hogwarts. Every year will be full of challenges.");
    }
}