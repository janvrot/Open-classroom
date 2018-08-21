package com.magi.player;

/**
 * Mage est une classe heritant de Player
 *
 * @see Player
 * @author Antoine JANVROT
 */
public class Mage extends Player {

    /**
     * Instanciation du Mage sans parametres avec le type Mage
     */
    public Mage() {
        this.setTypePlayer(TypePlayer.Mage);
    }

    /**
     * Inflige des degats correspondant a l'intelligence du joueur 1 au joueur 2
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {
        playerTwo.setLife(playerTwo.getLife() - playerOne.getIntelligence());
        System.out.println(playerOne.getPlayer() + " utilise Boule de Feu et inflige " + playerOne.getIntelligence() + " de degats " +
                "au " + playerTwo.getPlayer());
    }

    /**
     * Soigne le joueur 1 en fonction du double de son intelligence
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
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
