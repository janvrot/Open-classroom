package com.magi.game;

import com.magi.player.Guerrier;
import com.magi.player.Mage;
import com.magi.player.Player;
import com.magi.player.Rodeur;

import java.util.Scanner;

public class CreatePlayers {

    private Player player;

    public Player createPlayers() {
        this.chooseType();
        return this.player;
    }

    private void chooseType() {
        Scanner sc = new Scanner(System.in);
        boolean checkType = false;
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
        while (!checkType) {
            if (sc.hasNextInt()) {
                int type = sc.nextInt();
                switch (type) {
                    case 1:
                        this.player = new Guerrier();
                        checkType = true;
                        break;
                    case 2:
                        this.player = new Rodeur();
                        checkType = true;
                        break;
                    case 3:
                        this.player = new Mage();
                        checkType = true;
                        break;
                    default:
                        System.out.println("1 : Guerrier, 2 : Rodeur, 3 : Mage");
                        break;
                }
            } else {
                sc.next();
                System.out.println("Parametre invalide !!");
            }
        }
    }
}
