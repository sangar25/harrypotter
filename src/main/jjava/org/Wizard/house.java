package org.Wizard;

import java.util.Random;
public class House {
    public static String house;

    public String choice() {
        System.out.println("The SortingHat will choose your house ...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Random random = new Random();
        int nbr = random.nextInt(4) + 1;
        switch (nbr) {
            case 1:
                System.out.println("His choice is made, " + Player.name + " your house is Gryffindor \uD83E\uDD81");
                house = "Gryffindor";
                break;
            case 2:
                System.out.println("His choice is made, " + Player.name + " your house is Hufflepuff \uD83E\uDDA1");
                house = "Hufflepuff";
                break;
            case 3:
                System.out.println("His choice is made, " + Player.name + " your house is Ravenclaw \uD83E\uDD85");
                house = "Ravenclaw";
                break;
            case 4:
                System.out.println("His choice is made, " + Player.name+ " your house is Slytherin \uD83D\uDC0D");
                house = "Slytherin";
                break;
        }
        return null;
    }
}
