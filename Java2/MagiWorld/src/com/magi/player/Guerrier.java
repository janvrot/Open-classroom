package com.magi.player;

/**
 * Guerrier est une classe heritant de Player
 *
 * @see Player
 * @author Antoine JANVROT
 */
public class Guerrier extends Player {

    /**
     * Instanciation du Guerrier sans parametres avec le type Guerrier
     */
    public Guerrier() {
        this.setTypePlayer(TypePlayer.Guerrier);
    }

    /**
     * Inflige des degats correspondant a la force du joueur 1 au joueur 2
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {
        playerTwo.setLife(playerTwo.getLife() - playerOne.getStrength());
        System.out.println(playerOne.getPlayer() + " utilise Coup d'Epee et inflige " + playerOne.getStrength() + " de degats " +
                "au " + playerTwo.getPlayer());
    }

    /**
     * Inflige des degats correspondant au double de la force du joueur 1 au joueur 2 et le joueur 1 perd la moitie de
     * sa force en vie
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {
        playerOne.setLife(playerOne.getLife() - playerOne.getStrength() / 2);
        playerTwo.setLife(playerTwo.getLife() - playerOne.getStrength() * 2);
        System.out.println(playerOne.getPlayer() + " utilise Coup de Rage et inflige " + playerOne.getStrength() * 2 + " de degats " +
                "au " + playerTwo.getPlayer() + " et perd " + playerOne.getStrength() / 2 + " points de vie");
    }


}
