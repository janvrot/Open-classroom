package com.magi.game;

import com.magi.player.Guerrier;
import com.magi.player.Player;

import java.util.Scanner;

public class CreatePlayers {

    Player player;

    public Player createPlayer() {
        return this.player;
    }

    private void chooseType () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
        int type = sc.nextInt();
        switch (type){
            case 1:
                player = new Guerrier();
                break;
            case 2:

        }
    }
}
