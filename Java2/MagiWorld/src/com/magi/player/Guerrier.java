package com.magi.player;

public class Guerrier extends Player {

    public Guerrier() {
        this.setTypePlayer(TypePlayer.Guerrier);
    }

    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {
        playerTwo.setLife(playerTwo.getLife() - playerOne.getStrength());
        System.out.println(playerOne.getPlayer() + " utilise Coup d'Epee et inflige " + playerOne.getStrength() + " de dégats " +
                "au " + playerTwo.getPlayer());
    }

    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {
        playerOne.setLife(playerOne.getLife() - playerOne.getStrength() / 2);
        playerTwo.setLife(playerTwo.getLife() - playerOne.getStrength() * 2);
        System.out.println(playerOne.getPlayer() + " utilise Coup de Rage et inflige " + playerOne.getStrength() * 2 + " de dégats " +
                "au " + playerTwo.getPlayer() + " et perd " + playerOne.getStrength() / 2 + " points de vie");
    }


}
