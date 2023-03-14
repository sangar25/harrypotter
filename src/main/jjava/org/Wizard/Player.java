package org.Wizard;

import java.util.Scanner;

public class Player {
    public static String name;
    public static String house;
    private Pet[] pet;
    static String wand;

    public void setName(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ?");
        name = sc.nextLine();
        Player.name = name;
    }

    public void setHouse(String house) {
        House houses = new House();
        houses.choice();
        this.house = House.house;
    }

    public void setWand(String wand) {
        Wand wands = new Wand();
        wands.setSize();
        wands.setcore(wands.core);
        int size = wands.size;
        String core = wands.core;
        System.out.println("The size of your wand is " + size + "cm and the core is " + core);
        this.wand = size + core;
    }
}
