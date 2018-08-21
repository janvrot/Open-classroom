package com.magi.game;

import com.magi.player.*;

import java.util.Scanner;

public class CreatePlayer {

    private static Player player;

    public CreatePlayer() {
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
        this.addValue("chooseType");
        System.out.println("Niveau du personnage entre 1 et 100");
        this.addValue("chooseLvl");
        while (this.getStatRestant() > 0) {
            System.out.println("Force actuelle : " + player.getStrength() + " Points a ajouter : " + this.getStatRestant());
            this.addValue("addStrength");
            System.out.println("Agilite actuelle : " + player.getAgility() + " Points a ajouter : " + this.getStatRestant());
            this.addValue("addAgi");
            System.out.println("Intelligence actuelle : " + player.getIntelligence() + " Points a ajouter : " + this.getStatRestant());
            this.addValue("addIntel");
            if (this.getStatRestant() > 0) {
                System.out.println("Il reste des points a ajouter !!");
            }
        }
    }


    public static Player getPlayer() {
        return player;
    }

    private void addValue(String action) {
        Scanner sc = new Scanner(System.in);
        boolean checkType = false;

        while (!checkType) {
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                switch (action) {
                    case "chooseType":
                        checkType = this.chooseType(value);
                        break;
                    case "chooseLvl":
                        checkType = this.chooseLvl(value);
                        break;
                    case "addStrength":
                        checkType = this.addStat(action, value);
                        break;
                    case "addAgi":
                        checkType = this.addStat(action, value);
                        break;
                    case "addIntel":
                        checkType = this.addStat(action, value);
                        break;
                }

            } else {
                sc.next();
                System.out.println("Parametre invalide !!");
            }
        }
    }

    protected static boolean chooseType(int value) {
        boolean result = false;
        switch (value) {
            case 1:
                player = new Guerrier();
                result = true;
                break;
            case 2:
                player = new Rodeur();
                result = true;
                break;
            case 3:
                player = new Mage();
                result = true;
                break;
            default:
                System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
                result = false;
                break;
        }
        return result;
    }

    protected static boolean chooseLvl(int lvl) {
        boolean result = false;
        if (lvl < 1 || lvl > 100) {
            System.out.println("Niveau du personnage entre 1 et 100");
            result = false;
        } else {
            player.setLvl(lvl);
            player.setLife(lvl * 5);
            result = true;
        }
        return result;
    }

    protected static boolean addStat(String action, int stat) {
        boolean result = false;
        if (stat <= getStatRestant()) {
            switch (action) {
                case "addStrength":
                    player.setStrength(player.getStrength() + stat);
                    result = true;
                    break;
                case "addAgi":
                    player.setAgility(player.getAgility() + stat);
                    result = true;
                    break;
                case "addIntel":
                    player.setIntelligence(player.getIntelligence() + stat);
                    result = true;
                    break;
            }
        } else {
            System.out.println("Vous n'avez pas assez de points !");
            result = false;
        }
        return result;
    }

    protected static int getStatRestant() {
        int pointsRestants = player.getLvl() - player.getAgility() - player.getStrength() - player.getIntelligence();
        return pointsRestants;
    }
}
