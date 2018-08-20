package com.magi.main;

import com.magi.game.CreatePlayer;
import com.magi.player.Guerrier;
import com.magi.player.Player;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creation du personnage du joueur 1 :");
        Player playerOne = new CreatePlayer().getPlayer();
        System.out.println(playerOne);
        System.out.println("Creation du personnage du joueur 2 :");
        Player playerTwo = new CreatePlayer().getPlayer();
        System.out.println(playerTwo);
    }
}
