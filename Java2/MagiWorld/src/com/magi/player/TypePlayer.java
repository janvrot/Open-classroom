package com.magi.player;

/**
 * Player est l'enumeration donnant le type du joueur
 *
 * @author Antoine JANVROT
 */
public enum TypePlayer {
    Guerrier("Guerrier"),
    Rodeur("Rodeur"),
    Mage("Mage");

    private String type = "";

    /**
     * Recupere le type choisi
     *
     * @param type le type recupere
     */
    TypePlayer(String type) {
        this.type = type;
    }

}
