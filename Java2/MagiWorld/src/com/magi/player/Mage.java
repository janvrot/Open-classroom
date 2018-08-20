package com.magi.player;

public class Mage extends Player {

    public Mage() {
        this.setTypePlayer(TypePlayer.Mage);
    }

    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {
        playerTwo.setLife(playerTwo.getLife() - playerOne.getIntelligence());
        System.out.println(playerOne.getPlayer() + " utilise Boule de Feu et inflige " + playerOne.getIntelligence() + " de dégats " +
                "au " + playerTwo.getPlayer());
    }

    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {
        int maxLife = playerOne.getLvl() * 5;
        int startLife = playerOne.getLife();

        playerOne.setLife(playerOne.getLife() + playerOne.getIntelligence() * 2);
        if (playerOne.getLife() > maxLife) {
            playerOne.setLife(maxLife);
        }
        int diffLife = playerOne.getLife() - startLife;
        System.out.println(playerOne.getPlayer() + " utilise Soin et gagne " + diffLife + " points de vie");
    }
}
