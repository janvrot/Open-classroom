package com.magi.player;

/**
 * Rodeur est une classe heritant de Player
 *
 * @see Player
 * @author Antoine JANVROT
 */
public class Rodeur extends Player {

    /**
     * Instanciation du Rodeur sans parametres avec le type Rodeur
     */
    public Rodeur() {
        this.setTypePlayer(TypePlayer.Rodeur);
    }

    /**
     * Inflige des degats correspondant a l'agilite du joueur 1 au joueur 2
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    @Override
    public void basicAttaque(Player playerOne, Player playerTwo) {
        playerTwo.setLife(playerTwo.getLife() - playerOne.getAgility());
        System.out.println(playerOne.getPlayer() + " utilise Tir a l'arc et inflige " + playerOne.getAgility() + " de degats " +
                "au " + playerTwo.getPlayer());
    }

    /**
     * Ajoute la moitie du niveau du joueur 1 en agilite
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    @Override
    public void specialAttaque(Player playerOne, Player playerTwo) {
        playerOne.setAgility(playerOne.getAgility() + playerOne.getLvl() / 2);
        System.out.println(playerOne.getPlayer() + " utilise Concentration et gagne " + playerOne.getLvl() / 2 + " d'agilite");
    }
}
