package com.magi.game;

import com.magi.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fight {


    private List<Player> players = new ArrayList();

    public Fight() {
        boolean checkDeath = false;

        this.createPlayers(2);
        while (!checkDeath) {
            int i;
            for (i = 0; i < players.size(); i++) {
                checkDeath = startTurn(players.get(i));
                if (checkDeath)
                    break;
                this.attack(players.get(i), players.get(this.otherPlayer(i)));
            }
        }
    }

    private void createPlayers(int players) {
        for (int i = 1; i <= players; i++) {
            System.out.println("Creation du personnage du joueur " + i + ":");
            Player player = new CreatePlayer().getPlayer();
            player.setPlayer("Joueur " + i);
            this.players.add(player);
            System.out.println(player);
        }
    }

    private boolean startTurn(Player player) {
        if (player.getLife() > 0) {
            System.out.println(player.getPlayer() + "(" + player.getLife() + " vitalite) veuillez choisir votre action " +
                    "(1: Attaque Basique, 2: Attaque Speciale)");
            return false;
        } else {
            System.out.println(player.getPlayer() + " est mort !");
            return true;
        }
    }

    private int otherPlayer(int index) {
        if (index == players.size() - 1) {
            return 0;
        } else {
            return index + 1;
        }
    }


    private void attack(Player playerOne, Player playerTwo) {
        Scanner sc = new Scanner(System.in);
        boolean checkParam = false;

        while (!checkParam) {
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                switch (value) {
                    case 1:
                        playerOne.basicAttaque(playerOne, playerTwo);
                        break;
                    case 2:
                        playerOne.specialAttaque(playerOne, playerTwo);
                }
                checkParam = true;
            } else {
                sc.next();
                System.out.println("Parametre invalide !!");
            }
        }
    }
}
