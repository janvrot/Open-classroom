package com.magi.player;

import java.util.Scanner;

/**
 * Player est la classe abstraite contenant les caracteristiques du joueur
 *
 * @author Antoine JANVROT
 */
public abstract class Player {

    /**
     * Le Type du joueur
     *
     * @see TypePlayer
     */
    private TypePlayer typePlayer;

    private String player;
    private int lvl = 0;
    private int life = 0;
    private int strength = 0;
    private int agility = 0;
    private int intelligence = 0;

    /**
     * Instanciation du Player sans parametres
     */
    public Player() {

    }

    /**
     * Recupere le lvl du joueur
     *
     * @return le lvl du joueur
     */
    public int getLvl() {
        return lvl;
    }

    /**
     * Recupere la force du joueur
     *
     * @return la force du joueur
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Met a jour la force du joueur
     *
     * @param strength la force du joueur
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Recupere l'agilite du joueur
     *
     * @return l'agilite du joueur
     */
    public int getAgility() {
        return agility;
    }

    /**
     * Met a jour l'agilite du joueur
     *
     * @param agility l'agilite du joueur
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * Recupere l'intelligence du joueur
     *
     * @return l'intelligence du joueur
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Met a jour l'intelligence du joueur
     *
     * @param intelligence l'intelligence du joueur
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Recupere le type du joueur
     *
     * @return le type du joueur
     */
    public TypePlayer getTypePlayer() {
        return typePlayer;
    }

    /**
     * Recupere la vie du joueur
     *
     * @return la vie du joueur
     */
    public int getLife() {
        return life;
    }

    /**
     * Met a jour la vie du joueur
     *
     * @param life la vie du joueur
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * Met a jour le type du joueur
     *
     * @param typePlayer le type du joueur
     */
    public void setTypePlayer(TypePlayer typePlayer) {
        this.typePlayer = typePlayer;
    }

    /**
     * Met a jour le niveau du joueur
     *
     * @param lvl le niveau du joueur
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    /**
     * Recupere le statut du joueur
     *
     * @return le statut du joueur
     */
    public String getPlayer() {
        return player;
    }

    /**
     * Met a jour le statut du joueur
     *
     * @param player le statut du joueur
     */
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * Attaque classique du joueur
     *
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    public abstract void basicAttaque(Player playerOne, Player playerTwo);

    /**
     * Attaque speciale du joueur
     *
     * @param playerOne le joueur actif
     * @param playerTwo le joueur subissant une attaque
     */
    public abstract void specialAttaque(Player playerOne, Player playerTwo);

    /**
     * Affichage du joueur dans la console avec ses caracteristiques
     *
     * @return Les caracteristiques du joueur
     */
    public String toString() {
        String str = "Je suis le " + this.getTypePlayer() + " " + this.getPlayer();
        str += " niveau " + this.getLvl();
        str += " je possede " + this.getLife() + " en vitalite, ";
        str += this.getStrength() + " en force, ";
        str += this.getAgility() + " en agilite, ";
        str += this.getIntelligence() + " en intelligence !";
        return str;
    }
}
