package com.magi.player;

public class Rodeur extends Player {

    public Rodeur() {
        this.setTypePlayer(TypePlayer.Rodeur);
    }

    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {
        playerTwo.setLife(playerTwo.getLife() - playerOne.getAgility());
        System.out.println(playerOne.getPlayer() + " utilise Tir a l'arc et inflige " + playerOne.getAgility() + " de dégats " +
                "au " + playerTwo.getPlayer());
    }

    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {
        playerOne.setAgility(playerOne.getAgility() + playerOne.getLvl() / 2);
        System.out.println(playerOne.getPlayer() + " utilise Concentration et gagne " + playerOne.getLvl() / 2 + " d'agilité");
    }
}
