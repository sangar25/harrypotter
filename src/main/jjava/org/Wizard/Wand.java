package org.Wizard;
import java.util.Random;
public class Wand {
    public int size;
    public String core;

    public void setSize() {
        Random random = new Random();
        int size = random.nextInt(14) + 22;
        this.size = size;
    }

    public void setcore(String core){
        Random random = new Random();
        int nbr = random.nextInt(16) + 1;
        switch (nbr) {
            case 1:
                core = "Unicorn hair";
                break;
            case 2:
                core = "Dragon heartstring";
                break;
            case 3:
                core = "Phoenix feather";
                break;
            case 4:
                core = "Veela hair";
                break;
            case 5:
                core = "Thestral tail hair";
                break;
            case 6:
                core = "Troll whisker";
                break;
            case 7:
                core = "Kelpie hair";
                break;
            case 8:
                core = "Thunderbird tail feather";
                break;
            case 9:
                core = "Wampus cat hair";
                break;
            case 10:
                core = "White River Monster spine";
                break;
            case 11:
                core = "Rougarou hair";
                break;
            case 12:
                core = "Kneazle whiskers";
                break;
            case 13:
                core = "Horned Serpent horn";
                break;
            case 14:
                core = "Snallygaster heartstring";
                break;
            case 15:
                core = "Jackalope antler";
                break;
            case 16:
                core = "Basilisk horn";
                break;
        }
        this.core = core;
    }
}
